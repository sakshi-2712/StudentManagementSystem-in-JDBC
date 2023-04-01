package studentmanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import studentmannage.Student;
import studentmannage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    System.out.println("Welcome to student Management app");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true)
    {
    	System.out.println("PRESS 1 to ADD Student");
    	System.out.println("PRESS 2 to Delete Student");
    	System.out.println("PRESS 3 to  Display Student");
    	System.out.println("PRESS 4 to exit App");
    	int c=Integer.parseInt(br.readLine());
    	if(c==1)
    	{
    		//add student
    		System.out.println("Enter User Name:");
    		String name = br.readLine();
    		
    		System.out.println("Enter User phone number:");
    		String  phone = br.readLine();
    		
    		System.out.println("Enter User city:");
    		String city = br.readLine();
    		
    		Student st = new Student(name, phone, city);
    		boolean answer = StudentDao.insertStudentToDb(st);
    		if(answer)
    		{
    			System.out.println("Student added Succesfully.....");
    		}
    		else
    		{
    			System.out.println("Something went wrong try again...");
    		}
    		System.out.println(st);
    	}
    	else if(c==2)
    	{
    		//delete student
    		System.out.println("enter student  id to delete");
    		int userId=Integer.parseInt(br.readLine());
    		boolean f=StudentDao.deleteStudent(userId);
    		if(f)
    		{
    			System.out.println("Deleted....");
    		}
    		else
    		{
    			System.out.println("Something went wrong");
    		}
    	} 
    	else if(c==3)
    	{
    		//display student
    		StudentDao.showAllStudent();
    		
    	}
    	else if(c==4)
    	{
    		break;
    	}
    	else
    	{
    		
    	}
    }
    System.out.println("Thank you for using my Application");
    System.out.println("SEE YOU SOON");
	}
	

}
