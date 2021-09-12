package Collection;
import java.util.*;
//import java.io.PrintWriter;
import java.io.*;

public class TextFileOutputDemo 
{

	public static void main(String[] args)
	{
		String  fileName ="D:/out.txt";
		
		int integer = 10;
		PrintWriter outputStream = null;
		try
		{
			outputStream = new PrintWriter(new FileOutputStream(fileName,false));
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" +fileName);
			System.exit(0);
			
		}
		System.out.println("Enter three lines of text:");
		Scanner keyboard = new Scanner(System.in);
		
		for(int count = 1; count<=3; count++)
		{
			String line = keyboard.nextLine();
			outputStream.println(count +" "+line);
			
		}
		outputStream.println(integer);
		
		outputStream.close();
		System.out.println("Those lines were written to "+fileName);

	}

}
