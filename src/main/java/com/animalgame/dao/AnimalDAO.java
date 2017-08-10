package com.animalgame.dao;

import java.util.List;

import com.animalgame.model.AnimalModel;

public interface AnimalDAO {

	public List<AnimalModel> getall();
	public void insertAnimal(AnimalModel animal);
	public void delete(int id);
	public AnimalModel get(int id);
	
}
