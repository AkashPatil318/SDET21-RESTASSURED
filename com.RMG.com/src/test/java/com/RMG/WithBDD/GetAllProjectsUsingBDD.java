package com.RMG.WithBDD;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class GetAllProjectsUsingBDD {
	@Test
	public void getAllProjectsUsingBDD()
	{
		when()
		.get("http://localhost:8084/projects")
		
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
		
	}

}
