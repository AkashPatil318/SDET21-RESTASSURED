package com.RMG.WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class CreateProjectUsingBDD {
	@Test
	public void CreateProjectsUsingBDD()
	{
		JSONObject jobj =	new JSONObject();
		
		jobj.put("createdBy", "Rakesh");
		jobj.put("projectName","HMR");
		jobj.put("status","completed");
		jobj.put("teamSize",100);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		
		
	}

}
