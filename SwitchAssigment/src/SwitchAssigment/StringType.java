package SwitchAssigment;
import java.util.Scanner;

public class StringType
{
	public static void main(String[] args) 
	{
         // TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the moblie either a 3 gb or 8 gb: ");
		 String mobile = sc.next();
		  
		 switch(mobile) 
		 {
		  case "oppo3gb","samsung3gb","redmi3gb","gioni3gb","realme3gb": 
			              System.out.println("Mobile Ram is 3gb");
		                  break;
		  case "opoo8gb","samsung8gb","redmi8gb","gioni8b","realme8gb":
			             System.out.println("Mobile Ram is 8gb");
		  			     break;
		  default: break;
		 
	}
}
			

}			