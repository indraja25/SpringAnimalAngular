<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animal list</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
        
    </head>
    <body ng-app="myApp" class="ng-cloak">
    
    <div class="generic-container" ng-controller="AnimalController as ctrl">
    	<div class="panel panel-default">
              <div class="panel-heading"><span class="lead">New Animal Form </span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="ctrl.animal.id" />
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Type</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.animal.type" name="animal" class="animal form-control input-sm" placeholder="Enter model type" />
  								</div>
                          </div>
                      </div>
                        
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Health</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.animal.health" class="form-control input-sm" placeholder="Enter Heath"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm"/>
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" >Reset Form</button>
                          </div>
                      </div>
                  </form>
              </div>
          </div>
    		
    		
    		<div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">List of Animals </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>ID.</th>
                              <th>Type</th>
                              <th>Health</th>
                              
                              <th width="20%"></th>
                          </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="animal in ctrl.animals">
                              <td><span ng-bind="animal.id"></span></td>
                              <td><span ng-bind="animal.type"></span></td>
                              <td><span ng-bind="animal.health"></span></td>
                              <td>
                              <button type="button" ng-click="ctrl.edit(animal.id)" class="btn btn-success custom-width">Edit</button>  <button type="button" ng-click="ctrl.remove(animal.id)" class="btn btn-danger custom-width">Remove</button>
                              </td>
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
    		
    		
    
    </div>
    	<!-- <div align="center">
	        
	        <h3><a href="newAnimal">For New Animal click here</a></h3>
	        <table border="1">
	        	<th>No</th>
	        	<th>Type</th>
	        	<th>Health</th>
	        	
	        	<th>Action</th>
	        	 
				<c:forEach var="animal" items="${listAnimal}" varStatus="status">
	        	<tr>
	        		<td>${animal.id}</td>
					<td>${animal.type}</td>
					<td>${animal.health}</td>
					<td>
						<a href="editAnimal?id=${animal.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteAnimal?id=${animal.id}">Delete</a>
					</td>
							
	        	</tr>
				</c:forEach>	        	
			</table>
    	 </div>
          </div>
      </div> -->
      
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/animal_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/animal_controller.js' />"></script>
  
      
    </body>
</html>
