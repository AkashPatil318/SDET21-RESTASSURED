package com.RMG.WithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateResource {
	@Test
	public void create() 
	{
	JSONObject jobj =	new JSONObject();
	
	jobj.put("createdBy", "Akash");
	jobj.put("projectName","Google");
	jobj.put("status","complete");
	jobj.put("teamSize",1000);
	
	RequestSpecification req =RestAssured.given();
	req.contentType(ContentType.JSON);
	req.body(jobj);
	
	Response res = req.post("http://localhost:8084/addProject");
	res.then().assertThat().statusCode(201);
	
	System.out.println(res.asString());
	System.out.println(res.prettyPrint());
	System.out.println(res.prettyPeek());
	

}
}