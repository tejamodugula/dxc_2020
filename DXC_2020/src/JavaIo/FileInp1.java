package JavaIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInp1 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream mFis = new FileInputStream("C:\\fileop\\stringfile.txt");
			int i=0; // we are declaring a counter variable
			while((i = mFis.read()) != -1) // mFis.read() function will return int value of total characters in file
				System.out.print((char) i); // converting the returned ascii value code to character
			mFis.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
