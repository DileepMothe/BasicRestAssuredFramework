package com.test.utils;

public enum EndpointURL {

	ADD_EMPLOYEE("/AddEmployee"),
	UPDATE_EMPLOYEE("/Employee/update/details"),
	GET_EMPLOYEES("/AllEmployees"),
	GET_EMPLOYEEBYID("/Employee{id}"),
	DELETE_EMPLOYEE("/Employee");
	
	String resourcePath;
	
	public String getResourcePath() {
		return this.resourcePath;
	}

	public String getResourcePath(String data) {
		return this.resourcePath+data;
	}

	EndpointURL(String resourcePath){
		this.resourcePath=resourcePath;
	}
}
