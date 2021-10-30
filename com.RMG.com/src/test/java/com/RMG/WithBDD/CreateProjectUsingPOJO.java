package com.RMG.WithBDD;

import org.testng.annotations.Test;

import SDET21.GenericUtils.javautility;
import SDET21.POJO.Class.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingPOJO 
{
	javautility jLib = new javautility();
	@Test
	public void createProjectUsingPOJO()
	{
		
		baseURI="http://localhost";
		port=8084;
		
		//Read Data through POJO Class
		ProjectLibrary plib = new ProjectLibrary("ABCD"+jLib.getRandomNunber(), "AccionLabs"+jLib.getRandomNunber(), "Completed", 10);
		
		//Request Specification
		given().contentType(ContentType.JSON).body(plib)
		
		//Request
		.when().post("/addProject")
		
		//Validation
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
}

