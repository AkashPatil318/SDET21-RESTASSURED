package SDET21.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtilty {
	
	Connection con = null;
	ResultSet result = null;
	
	/**
	 * 
	 * @throws Throwable 
	 * @throws Throwable
	 */
	public void connectToDB() throws Throwable {
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		con = DriverManager.getConnection(IPathConstants.dbURL,IPathConstants.dbUsername,IPathConstants.dbPassword);
	}
	public void closeDB() throws Throwable
	
	{
		con.close();
	}
    	
    
    public String executeQueryAndGetData(String query,int Columnindex,String expData)  throws SQLException {
    	Boolean flag=false;
    	result=con.createStatement().executeQuery(query);
    while(result.next()) {
    	String actData = result.getString(Columnindex);
    	if(actData.equalsIgnoreCase(expData))
    		
    	{
    		flag = true;
    		break;
    	}
    		
    	}
    	if(flag)
    	{
    		System.out.println(expData +"data verified in database");
    		return expData;
    	}
    	else
    	{
    		System.out.println(expData + "data not verified");
    		return "";
    	}
    }
	

}
