package com.RMG.WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectUsingBDD {
	@Test
	public void deleteProjectUsingBDD ()
	{
		
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_006")
		.then()
		.log().all()
		.assertThat()
		.statusCode(204);
		
	}

}
