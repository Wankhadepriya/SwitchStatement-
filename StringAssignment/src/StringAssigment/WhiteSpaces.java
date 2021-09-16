package StringAssigment;

public class WhiteSpaces
{

	public static void main(String[] args) 
	{
		
		String s = "Say Something atleast";
		String str = s.replaceAll("\\s", "");
		System.out.println(str);
	}
}
