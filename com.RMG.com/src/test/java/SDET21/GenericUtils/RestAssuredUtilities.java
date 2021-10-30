package SDET21.GenericUtils;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class RestAssuredUtilities {

	public String getJsonData(Response res,String jsonPath)
	{
		String value =res.jsonPath().get(jsonPath);
		return value;
	}
	

}
