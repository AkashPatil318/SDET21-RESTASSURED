package SDET21.Complex.ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class DynamicResponse {
	
@Test
	
	public void dynamicresponse() 
	
	{
		baseURI ="http://localhost";
		port=8084;
		
		String expData="chrome";
		
		//store the response
	Response res =when().get("/projects");
	
	//capture all the project name and store in a string
	List<String> pNames = res.jsonPath().get("projectName");

	
	for(String actData:pNames)
	{
		System.out.println(actData);
		if(actData.equalsIgnoreCase(expData))
		{
			Assert.assertEquals(actData, expData);
		    System.out.println(actData +"data Present");
		    break;
		}
	}
	}
}
	


