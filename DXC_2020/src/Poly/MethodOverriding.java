package Poly;


public class MethodOverriding 
{
public void m1()
{
	System.out.println("okok");
}
 class motor extends MethodOverriding
 {
	 public void m1()
	 {
		 System.out.println("ppppppppp");
	 }
 }
 static class MainMethodOver 
 {
 	public static void main(String[] args)
 	{
 MethodOverriding m =new MethodOverriding();
     m.m1();
 	}		
}
}
