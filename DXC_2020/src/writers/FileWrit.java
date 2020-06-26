package writers;

import java.io.FileWriter;

public class FileWrit 
{

	// FileWriter class is used to write character oriented data

	public static class FileWriterExample
	
{
		
		
		public static void main(String[] args) throws Exception
		{

			FileWriter mFw = new FileWriter("C:\\fileop\\myfile.txt");
			mFw.write("Hello File Writer you are writing something");
			mFw.close();
			System.out.println("File written Successfully");
		}

	}
}