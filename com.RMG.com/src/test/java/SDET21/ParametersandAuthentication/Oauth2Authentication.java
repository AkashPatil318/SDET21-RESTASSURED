package SDET21.ParametersandAuthentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class Oauth2Authentication {
	@Test
	public void Oauth()
	{
		//Generate the Token
		Response res = given()
		.formParam("client_id", "SDET21-RMGY-API")
		.formParam("client_secret", "883c29ab1a29cb94623506829b8c5028")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://example.com")
		.formParam("code" ,"authorization_code")
		
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		//capture the token
		String Token =res.jsonPath().get("access_token");
		System.out.println(Token);
		
	//create a new request to access the token
		given()
		.auth()
		.oauth2(Token)
		.pathParam("USER_ID","2401")
		
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
		.then().log().all();

	}

}
