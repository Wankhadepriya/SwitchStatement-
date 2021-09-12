package Collection;
imoprt java.util.*;
public class Student extends StudentArrayList 
{

	
		// TODO Auto-generated method stub
		String name;
		int roll;
		int marks;
	
		
		public Student(String name, int roll, int marks )
		{
			this.name = name;
			this.roll= roll;
			this.marks = marks;
			
		 }
		public void display()
		{
			System.out.println("Name:"+name);
			System.out.println("rollNumber"+roll);
			System.out.println("Marks"+Marks);
			
		 }
		
}


