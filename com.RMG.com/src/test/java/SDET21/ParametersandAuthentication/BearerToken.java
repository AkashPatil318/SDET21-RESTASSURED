package SDET21.ParametersandAuthentication;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerToken {
	
	@Test
	public void bearerToken() 
	{
		HashMap map = new HashMap();
		map.put("name", "REST-SDET21-BEARER-Token");
		
		given()
		.auth()
		.oauth2("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")
		.body(map)
		
		.when()
		.post("https://api.github.com/user/repos")
		.then().log().all();

	}

}
