import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Year");
		 int year = sc.nextInt();
		 
		 if(year%400 == 0)
		 {
			 System.out.println("Year is leap");
		 }
		 else if(year%100 == 0)
		 {
			 System.out.println("year is not leap");
		 }

	}

}
