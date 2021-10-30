package SDET21.ParametersandAuthentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class pathParameter {
	
	@Test
	public void pathParameter()
	{

		baseURI ="http://localhost";
		port=8084;
		
		given()
		.pathParam("projID","TY_PROJ_002")
		
		.when()
		.get("/projects/{projID}")
		
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
	}

}
