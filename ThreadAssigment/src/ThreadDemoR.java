
public class ThreadDemoR implements Runnable{

	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("thread is running ...");
		

	}
	public static void main(String args[])
	{
		ThreadDemoR td = new ThreadDemoR();
		Thread t1 = new Thread(td);
		t1.start();
	}

}
