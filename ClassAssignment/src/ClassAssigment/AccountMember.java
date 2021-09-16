package ClassAssigment;
import java.util.Scanner;

public class AccountMember
{

		     long Account_No;
			  String Customer_Name;
			
			public void Demo() 
			{
				Account_No =101;
				Customer_Name ="Akash";
				System.out.println("Account no." + Account_No + " Account Name " + Customer_Name);
				System.out.println("I'm default constructor");
			}
			
			public void  Pram(int acc_no,String str) 
			{
				Account_No = acc_no;
				Customer_Name = str; 
				System.out.println("Enter the Account name" + Account_No + " and Account no." + Customer_Name);
				System.out.println("I'm parameterized constructor");
			}
			
			public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				AccountMember ac =new AccountMember();
				ac.Demo();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Account no. : ");
				int An = sc.nextInt();
				
				System.out.println("Enter the Account Name: ");
				String cn = sc.next();
				ac.Pram(An, cn);
				
			}
	

		


}


