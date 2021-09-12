package Loops;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number");
		 int no = sc.nextInt();
		 int a[] = new int[no];
		 
		 System.out.println("Enter a element of array");
		 for(int i=0; i<no; i++)
		 {
			 a[i] =sc.nextInt();
		 }
		 
		 int sumE=0,sumO=0;
		 
		 for(int j=1; j<no; j++)
		 {
			 if(a[j]%2==0)
			 {
				 sumE=sumE+a[j];
			 }
			 else
			 {
				 sumO=sumO+a[j];
			 }
			 
		 }
		 System.out.println("Sum of Even Number"+ sumE);
		 
		 
		 System.out.println("Sum of odd Number"+ sumO);

	}

}
