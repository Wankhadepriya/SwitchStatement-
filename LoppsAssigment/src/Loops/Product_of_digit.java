package Loops;

import java.util.Scanner;

public class Product_of_digit {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number");
	    int no= sc.nextInt();
		int product=1;
		
		while(no != 0)
		{
			
			product = product*(no%10);
			no = no/10;
			
			
		}
		System.out.println("Product of digit:"+ product);

	}

}
