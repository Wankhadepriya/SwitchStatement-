import java.util.Scanner;
public class MaxNo
{

       public static void main(String[] args)
       {
				// TODO Auto-generated method stub
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter a Number1 Number 2 Number3");
				 int no1 = sc.nextInt();
				 int no2 = sc.nextInt();
				 int no3 = sc.nextInt();
				 
				 if(no1>no2)
				 {
					 System.out.println("Number 1 is Maximum");
				 }
				 else if(no2>no3)
				 {
					  System.out.println("Number 2 Maximum ");
				 }
				 else
				 {
					 System.out.println("Number3 Maximum");
				 }
				 
			}

	

}
