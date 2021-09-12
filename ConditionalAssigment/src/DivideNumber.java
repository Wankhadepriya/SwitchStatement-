import java.util.Scanner;

public class DivideNumber
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number");
		 int no = sc.nextInt();
		 
		 if(no%5 ==0 )
		 {
			 System.out.println("Number is divided by 5");
		 }
		 else if(no%11 == 0)
		 {
			  System.out.println("number is divided by 11");
		 }
		 else
		 {
			 System.out.println("Number is not divided by 5 and 11");
		 }
		 
	}
}
