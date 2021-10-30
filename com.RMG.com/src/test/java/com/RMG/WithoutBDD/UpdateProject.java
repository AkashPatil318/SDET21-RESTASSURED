package com.RMG.WithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void updateProject()
	{
		JSONObject jobj =	new JSONObject();
		jobj.put("createdBy", "Akash");
		jobj.put("projectName","AccionLabs");
		jobj.put("status","complete");
		jobj.put("teamSize",25);
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobj);
		
		Response res =req.put("http://localhost:8084/projects/TY_PROJ_205");
		res.then().assertThat().statusCode(200);
	}

}
