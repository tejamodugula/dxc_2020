package Thred;

public class MultiThread1 implements Runnable
{
	@Override
	public void run() {
		for(int i=0; i<5; i++) 
		{
			try 
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Exception is "+e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		MultiThread1 t1 = new MultiThread1();
		MultiThread1 t2 = new MultiThread1();
		
		t1.run();
		t2.run();
	}

}
