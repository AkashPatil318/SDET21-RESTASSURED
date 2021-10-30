package com.RMG.WithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectUsingHashMap {
	@Test
	public void createProjectUsingHashMap() 
	{
		HashMap map = new HashMap();
		map.put("createdBy", "Manoj");
		map.put("projectName", "chrome");
		map.put("status", "Completed");
		map.put("teamsize", 20);
		//request specification
		given()
		.contentType(ContentType.JSON)
		.body(map)
		
		//actual request
		.when()
		.post("http://localhost:8084/addProject")
		
		//validation
		.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
