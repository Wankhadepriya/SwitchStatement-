package Loops;

import java.util.Scanner;

public class GCD_And_LCM {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   int num1,num2,maxNo,lcm=0,gcd=1;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter two number");
		   num1= sc.nextInt();
		   num2= sc.nextInt();
		   
		   for(int j=1; j<=num1 && j<num2; ++j)
		   {
			   if(num1%j == 0 && num2%j == 0)
			   {
				   gcd= j;
				   
			   }
			   
		   }
		   System.out.println("GDC of Two Number is: "+ gcd);
		   
		   maxNo = num1>num2?num1:num2;
		   for(int i=0; i <maxNo; i++)
		   {
			   if(maxNo%num1==0 && maxNo%num2==0)
			   {
				   lcm = maxNo;
				   break;
			   }
			   maxNo++;
			   
		   }
		   System.out.println("LCM of Two Number is: "+ lcm);
		   
	}

}
