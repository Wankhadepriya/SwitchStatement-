package Containment;
import java.util.*;

public class MainDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Department d=new Department();
	    Student s=new Student();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter id:");
        int id=sc.nextInt();
		
        System.out.println("Enter name:");
        String name=sc.next();
        
		 d.setId(id);
	     System.out.println("Department id "+d.getId());
		 
		
		 d.setName(name);
		 System.out.println("Department Name "+d.getName());

		 System.out.println("Enter roll number:");
	        int rollNo=sc.nextInt();
			
	        System.out.println("Enter name:");
	        String name1=sc.next();
	        
			 s. setRoll_no(rollNo);
		     System.out.println("Student roll_no "+s.getRoll_no());
			 
			
			 s.setName(name1);
			 System.out.println("Student Name "+s.getName());
	}

}
