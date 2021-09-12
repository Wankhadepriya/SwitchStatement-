
public class TreadPriority  extends Thread
{
	public TreadPriority(String str)
	{
		super(str);
	}
   public void run()
   {
	 for(int p=1; p<4; p++)
	 {
		 for(int j=0; j<4; j++)
		 {
			 System.out.print("");
			 System.out.println(getName());
		 }
		 System.out.print(" .");
			 
		 }
	 }
   
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread t1 = new TreadPriority("1");
		Thread t2 = new TreadPriority("2");
		
		t1.setPriority(Thread.NORM_PRIORITY+1);
		t2.setPriority(Thread.NORM_PRIORITY-1);
		
		System.out.println("Thread 1 has priority" + t1.getPriority());
		System.out.println("Thread 1 has priority" + t1.getPriority());
		
		t1.start();
		t2.start();
		

	}

}
