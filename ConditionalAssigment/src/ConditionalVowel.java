import java.util.Scanner;

public class ConditionalVowel {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Alphabet");
		char c = sc.nextLine().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			System.out.println("Alphabet are vowel");
		}
		else
		{
			System.out.println("Alphabet are consonet");
		}
	}

}
