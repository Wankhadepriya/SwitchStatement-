package SwitchAssigment;
import java.util.Scanner;

public class AreaCalculator 
{
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Type number for the following operation you want to perform :");
			System.out.println(" 1.Area of Square\n 2.Area of Right angle Triangle \n 3.Area of Circle 4.Area of Rectangle \n 5.Perimeter of Square\n 6.Circumference of the Circle :");
		    int area=sc.nextInt() ;
		    switch(area)
		    {
		    case 1:System.out.println("Enter the leght: ");
				   int l = sc.nextInt();
				   int a= l*l;
				   System.out.println("Area of Square: "+a);
				   break;
		    case 2:System.out.println("Enter the Height and Base for the Triangle:");
					int h = sc.nextInt();
					int b = sc.nextInt();
					double at = 0.5*h*b;
					System.out.println("Area of Triangle: "+at);
					break;
		    case 3:	System.out.println("Enter the Radius of the Circle: ");
		    		int r = sc.nextInt();
		    		double ac= 3.14*r;
		    		System.out.println("Area of Circle:"+ac);
		    		break;
		    case 4:	System.out.println("Enter the Length and Width of the Rectangle: ");
		    		int l1 = sc.nextInt();
		    		int w = sc.nextInt();
		    		double ar= 0.5*l1*w;
		    		System.out.println("Area of Rectangle:"+ar);
		    		break;
		    case 5: System.out.println("Enter of side of the Square: ");
		    		int pd = sc.nextInt();
		    		double as = 4*pd;
		    		System.out.println("Perimeter of Square: "+as);
		    		break;
		    case 6: System.out.println("Enter the radius for Circumference of the circle:");
		    		int r1 = sc.nextInt();
		    		double acc = 2*3.14*r1;
		    		System.out.println("Area of Circumference of Circle: "+acc);
		   		
		    default: break;
		    
		    }

		}
}



