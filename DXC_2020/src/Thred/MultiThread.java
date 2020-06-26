package Thred;

public class MultiThread extends Thread
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread("Thread 1");
		Thread t2=new Thread("Thread 2");
		t1.start();
		t2.start();
		System.out.println("Thread names are as following\n\n"+t1.getName()+"\n"+t2.getName());

	}

	@Override
	public void run()
	{
		System.out.println("hi i am a run method");
	}

}
