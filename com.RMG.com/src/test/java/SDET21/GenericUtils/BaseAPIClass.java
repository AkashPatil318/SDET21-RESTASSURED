package SDET21.GenericUtils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class BaseAPIClass {
	public DataBaseUtilty dLib = new DataBaseUtilty();
	public RestAssuredUtilities rLib = new RestAssuredUtilities();
	public javautility jLib = new javautility();
	
	@BeforeSuite
	public void bsConfig() throws Throwable
	{
        dLib.connectToDB();
		baseURI = "http://localhost";
		port = 8084;
	}
	@AfterSuite
	public void asConfig() throws Throwable
	{
		dLib.closeDB();
	}
}
