package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SchoolResult 
{
	InputStreamReader isr=null;
	BufferedReader buff=null;
	ArrayList<Student> mStudentList = new ArrayList<Student>();
	boolean studentChoice = true;
public static void main(String[] args) throws IOException 
{
	SchoolResult s1=new SchoolResult();
	s1.isr=new InputStreamReader(System.in);
	s1.buff=new BufferedReader(s1.isr);
	System.out.println("Welcome to Parent Teacher Meeting Result\n\n\n");
	do
	{
		Student mStudent=new Student();
		System.out.println("enter the student name");
		String name=s1.buff.readLine();
		mStudent.setName(name);
		System.out.println("Enter your roll number\n");
		String rollno = s1.buff.readLine();
		mStudent.setRollno(rollno);
		
		System.out.println("Enter your Class and Section\n");
		String classSection = s1.buff.readLine();
		mStudent.setName(classSection);
		
		System.out.println("Enter your Stream\n");
		String stream = s1.buff.readLine();
		mStudent.setStream(stream);
		
		System.out.println("Enter your 5 Subject Marks\n");
		int marks1 = Integer.parseInt(s1.buff.readLine());
		int marks2 = Integer.parseInt(s1.buff.readLine());
		int marks3 = Integer.parseInt(s1.buff.readLine());
		int marks4 = Integer.parseInt(s1.buff.readLine());
		int marks5 = Integer.parseInt(s1.buff.readLine());
		
		mStudent.setMarks1(marks1);
		mStudent.setMarks2(marks2);
		mStudent.setMarks3(marks3);
		mStudent.setMarks4(marks4);
		mStudent.setMarks5(marks5);
		
		mStudent.setTotalmarks(mStudent);
		
		System.out.println("Result is "+mStudent.getTotalmarks());
		
		System.out.println("Do you want to Continue\n yes\n no");
		String choice = s1.buff.readLine();
		if(choice.equalsIgnoreCase("no"))
			s1.studentChoice = false;
		s1.mStudentList.add(mStudent);
	}
	while (s1.studentChoice);
}
}
