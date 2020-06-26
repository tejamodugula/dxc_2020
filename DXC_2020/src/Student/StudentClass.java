package Student;

public class StudentClass 
{
 String studentName;
 String rollNo;
 String className;
 String streamName;
 String maths;
 String dcmachines;
 String emf;
 String edc;
 String acmachines;
 
public StudentClass(String studentName, String rollNo, String className, String streamName, String maths,
		String dcmachines, String emf, String edc, String acmachines) 
{
	this.studentName = studentName;
	this.rollNo = rollNo;
	this.className = className;
	this.streamName = streamName;
	this.maths = maths;
	this.dcmachines = dcmachines;
	this.emf = emf;
	this.edc = edc;
	this.acmachines = acmachines;
}
public void TotalMarks()
{
	int total= (Integer.parseInt(maths)+Integer.parseInt(dcmachines)+Integer.parseInt(emf)+Integer.parseInt(edc)+Integer.parseInt(acmachines))/5;
     
	System.out.println(total); 
	
	if(total>90)
	{
		System.out.println("Your grade is ------A+");
	}
	else if ((total>80) && (total>90))
	{
		System.out.println("Your grade is ------A");
	}
	else if((total>70) && (total<80))
	{
		System.out.println("Your grade is ------B+");
	}
	else if((total>60) && (total<70))
	{
		System.out.println("Your grade is ------B");
	}
	else if((total>50) && (total<60))
	{
	    System.out.println("Your grade is ------ C+");
	}
	else if((total>40) && (total<50))
	{
		System.out.println("Your grade is ------ C");	
	}
	else if (total<40)
	{
		System.out.println("Your grade is ------ Fail");
	}
}
}