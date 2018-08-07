package com.test.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.test.utils.EndpointURL;
import com.test.utils.URL;
import com.test.webservicesmethods.WebServices;

public class TC_001 {
	
	@BeforeClass
	public void setUp()
	{
		
	}
	
	@Test
	public void verifyGetAllEmployee(){
		String url=URL.fixURL+EndpointURL.ADD_EMPLOYEE.getResourcePath();
		Response response=WebServices.Get(url);
		System.out.println(response.getBody().toString());
	}

	@Test
	public void verifyGetEmployeeById(){
		String url=URL.fixURL+EndpointURL.ADD_EMPLOYEE.getResourcePath("1");
		Response response=WebServices.Get(url);
		System.out.println(response.getBody().toString());
	}
}
