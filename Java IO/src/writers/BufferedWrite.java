package writers;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWrite 
{

	// BufferedWriter class is used to provide buffering for writer instances

		public static void main(String[] args) throws Exception
		{
			FileWriter mFw  = new FileWriter("C:\\fileop\\myfile.txt");
			BufferedWriter mBfw = new BufferedWriter(mFw);
			mBfw.write("Hello Reader Writers i was waiting for you");
			mBfw.close();
			System.out.println("File written successfully");
		}
	
}
