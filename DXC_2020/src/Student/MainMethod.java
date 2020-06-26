package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainMethod 
{
public static void main(String[] args) throws IOException 
{
	InputStreamReader i1=new InputStreamReader(System.in);
	BufferedReader b1=new BufferedReader(i1);
	System.out.println("enter the student name");
	String Sname=b1.readLine();
	System.out.println("enter the rollNumber");
	String rollnumber=b1.readLine();
	System.out.println("enter the classname");
	String classname=b1.readLine();
	System.out.println("enter the streamname");
	String streamname=b1.readLine();
	System.out.println("enter the maths marks");
	String maths=b1.readLine();
	System.out.println("enter the dcmachines marks");
	String dcmachines=b1.readLine();
	System.out.println("enter the emf marks");
	String emf=b1.readLine();
	System.out.println("enter the edc marks");
	String edc=b1.readLine();
	System.out.println("enter the acmachines marks");
	String acmachines=b1.readLine();
	StudentClass m1=new StudentClass(Sname,classname,rollnumber,streamname,maths,dcmachines,emf,edc,acmachines);
	m1.TotalMarks();
	}
}
