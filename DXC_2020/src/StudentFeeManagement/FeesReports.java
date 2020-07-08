package StudentFeeManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

	class Userclass<T> 
	{ 
		T obj;

		void create(T obj)
		{
			this.obj = obj;
		}

		T getInstance()
		{ //
			return obj;
		}
	}
public class FeesReports
{
	InputStreamReader ip=null;
	BufferedReader buff=null;
	AccountLogin account=null;
	AdminLogin admin=null;
	String choiceoption;
	boolean collegeopen = true;
	String feesChoice;
public void main(String[] args) throws IOException, SQLException
{
	FeesReports f1=new FeesReports(); 
	f1.ip=new InputStreamReader(System.in);
	f1.buff=new BufferedReader(f1.ip);
	System.out.println("welcome to fees reports\n");
	System.out.println("enter your choice");
	System.out.println("1.Admin Login \n 2.Account Login");
	String mchoice=f1.buff.readLine();
	if(mchoice.equalsIgnoreCase("1"))
	{
		 System.out.println("Enter Your Name:");
    	 String Aname=f1.buff.readLine();
    	 System.out.println("Enter Your Password:");
    	 String Apass=f1.buff.readLine();
    	 if(Aname.equals("Admin")&&Apass.equals("Admin1234")){
    		 { 
    			 Userclass<Admin> obj=new Userclass<Admin>();
        		 obj.create(new Admin());
        		obj.getInstance(); 
        		 System.out.println("1.Add Accountant\n2.View Accountant\n3.LogOut");
        		 String mychoice=f1.buff.readLine();
        		 switch(Integer.parseInt(mychoice))
        		 {
        		 case 1:
        			     f1.admin.addAccount();
        			     break;
        		 case 2:
        			    f1.admin.viewAccount();
        			     break;
        		 case 3:
        			    f1.admin.logOut();
        			    break;
        		 default:
        			 System.out.println("You choose a Invalid Option");
        			 break;
  
        		 }
        		 System.out.println("Do you want to Continue\n yes\n no");
      			String choice =f1.buff.readLine();
      			if(choice.equalsIgnoreCase("no"))
     				f1.collegeopen = false;
         	 }while (f1.collegeopen);
	}
    	 }
	
}
}