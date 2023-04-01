package studentmannage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;
	public static Connection createC() {
		
		
		// TODO Auto-generated method stub
      try
      {
    	  //load the driver
    	  Class.forName("com.mysql.cj.jdbc.Driver"); 
    	  //create the connection
    	  String user ="root";
    	  String password="Sakshi@123";
    	  String url="jdbc:mysql://localhost:3306/student_management";
    	  
    	  con= DriverManager.getConnection(url,user,password);
      }catch(Exception e)
      {
    	 e.printStackTrace(); 
      }
      return con;
	}

}
