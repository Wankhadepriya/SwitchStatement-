import java.util.*;
public class SimpleThread extends Thread 
{
    public void run()
    {
    	int a =10;
    	int b=12;
    	int result = a+b;
    	System.out.println("Thread started");
    	System.out.println("Sum of tow number"+result);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        SimpleThread  t1= new 	SimpleThread();
        t1.start();

	}

}
