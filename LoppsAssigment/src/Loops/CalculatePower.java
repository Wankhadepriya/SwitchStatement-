package Loops;
import java.util.Scanner;
public class CalculatePower {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   int power=0;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter two number");
		   int base= sc.nextInt();
		   int index= sc.nextInt();

		   for(int i=2; i<index;i++)
		   {
			   power=base*i;
			   
		   }
		   System.out.println("Power of"+base+"and"+index+"is:"+power);
	}

}
