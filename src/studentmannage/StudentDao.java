package studentmannage;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDb(Student st) {
		boolean f =false;
		// TODO Auto-generated method stub
            try
            {
            	Connection con=ConnectionProvider.createC();
            	String q="insert into students(sname,sphone,scity) values(?,?,?)";
            	PreparedStatement pstmt = con.prepareStatement(q); 
            	pstmt.setString(1,st.getsName());
            	pstmt.setString(2, st.getsCity());
            	pstmt.setString(3, st.getsPhone());
            	
            	pstmt.executeUpdate();
            	f=true;
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            }
            return f;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f =false;
		// TODO Auto-generated method stub
            try
            {
            	Connection con=ConnectionProvider.createC();
            	String q = " delete from students where sid=?";
            	PreparedStatement pstmt = con.prepareStatement(q); 
            	pstmt.setInt(1,userId);
            	
            	pstmt.executeUpdate();
            	f=true;
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            }
            return f;
	}

	public static void showAllStudent() {
		// TODO Auto-generated method stub
		boolean f =false;
		// TODO Auto-generated method stub
            try
            {
            	Connection con=ConnectionProvider.createC();
            	String q="select * from students";
            	Statement stmt = con.createStatement(); 
            	
            	ResultSet set=stmt.executeQuery(q);
            	while(set.next())
            	{
            		int id=set.getInt(1);
            		String name = set.getString(2);
            		String phone = set.getString(3);
            		String city = set.getString(4);
            		
            		System.out.println("ID: "+ id);
            		System.out.println("NAME:" +name);
            		System.out.println("PHONE:"+phone);
            		System.out.println("CITY:"+city);
            		System.out.println("+++++++++++++++++++++++++++++");
            	}
            	f=true;
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            }
          
	}
		
	}


