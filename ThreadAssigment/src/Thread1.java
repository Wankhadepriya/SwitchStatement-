
public class Thread12 extends Thread
{
	public void run()
    {
        for(int i = 0; i <= 1000; i++)
        {
            System.out.println(i);
        }
    }
}
public class Thread21 extends thread
{
	public void run()
	{
		for(int i = 0; i <= 2000; i++)
        {
            System.out.println(i);
        }
	}
}

public class Thread1
{
public static void main(String[] args)
{
		// TODO Auto-generated method stub
	Thread12 t1 = new Thread12();
	t1.start();
	
	Thread21 t2 = new Thread21();
	t2.start();
	
	   
	   
	
}
}


