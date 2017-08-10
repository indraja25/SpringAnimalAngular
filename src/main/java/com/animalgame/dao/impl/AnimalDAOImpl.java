package com.animalgame.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.animalgame.dao.AnimalDAO;
import com.animalgame.model.AnimalModel;
/*
@Repository
@Qualifier("AnimalDAO")
public class AnimalDAOImpl implements AnimalDAO{
	@Autowired
    JdbcTemplate jdbcTemplate;
	public List<AnimalModel> getall() {
		List<AnimalModel> animals=jdbcTemplate.query("SELECT * from animal", new BeanPropertyRowMapper(AnimalModel.class));
		return animals;
	}

	public void insertAnimal(AnimalModel animal) {
		// TODO Auto-generated method stub
		
	}
	

}
*/



public class AnimalDAOImpl implements AnimalDAO{


	
private JdbcTemplate jdbcTemplate;
	
	public AnimalDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<AnimalModel> getall() {
		String sql = "SELECT * FROM animals";
		List<AnimalModel> listAnimal = jdbcTemplate.query(sql, new RowMapper<AnimalModel>() {

			
			public AnimalModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				AnimalModel animal = new AnimalModel();
	
				animal.setId(rs.getInt("animalscol"));
				animal.setType(rs.getInt("type"));
				animal.setHealth(rs.getInt("health"));
				animal.setAnimalName(rs.getString("animal_ame"));
				
				return animal;
			}
			
		});
		
		return listAnimal;

	}

	public void insertAnimal(AnimalModel animal) {
		if (animal.getId() > 0) {
			// update
			String sql = "UPDATE animals SET type=?, health=? WHERE animalscol=?";
			jdbcTemplate.update(sql, animal.getType(), animal.getHealth(),animal.getId(),animal.getAnimalName());
		} else {
			// insert
			String sql = "INSERT INTO animals (type, health,animal_ame)"
						+ " VALUES (?, ?,?)";
			jdbcTemplate.update(sql, animal.getType(), animal.getHealth(),animal.getAnimalName());
		}	}
	
	
	public void delete(int contactId) {
		String sql = "DELETE FROM animals WHERE animalscol=?";
		jdbcTemplate.update(sql, contactId);
	}

	
	public AnimalModel get(int id) {
		String sql = "SELECT * FROM animals WHERE animalscol=" + id;
		return jdbcTemplate.query(sql, new ResultSetExtractor<AnimalModel>() {

			
			public AnimalModel extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				if (rs.next()) {
					AnimalModel animal = new AnimalModel();
					animal.setId(rs.getInt("animalscol"));
					animal.setType(rs.getInt("type"));
					animal.setHealth(rs.getInt("health"));
					animal.setAnimalName(rs.getString("animal_ame"));
					return animal;
				}
				
				return null;
			}
			
		});
	}
	
}