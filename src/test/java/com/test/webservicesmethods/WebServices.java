package com.test.webservicesmethods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class WebServices {
	
	public static Response Post(String uRI,String stringJSON)
	{
		RequestSpecification rs=RestAssured.given().body(stringJSON);
		rs.content(ContentType.JSON);
		Response response=rs.post(uRI);
		return response;
	}
	
	
	public static Response Get(String uRI)
	{
		RequestSpecification rs=RestAssured.given();
		rs.content(ContentType.JSON);
		Response response=rs.get(uRI);
		return response;
	}
	
	
	public static Response Put(String uRI,String stringJSON)
	{
		RequestSpecification rs=RestAssured.given().body(stringJSON);
		rs.content(ContentType.JSON);
		Response response=rs.put(uRI);
		return response;
	}

	public static Response Delete(String uRI)
	{
		RequestSpecification rs=RestAssured.given();
		rs.content(ContentType.JSON);
		Response response=rs.delete(uRI);
		return response;
	}
	
}
