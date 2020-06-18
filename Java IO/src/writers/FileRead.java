package writers;

import java.io.FileReader;

public class FileRead
{

	// FileReader is a class used to read data from file, it is characted oriented class

	public static void main(String[] args) throws Exception{

		FileReader mFr = new FileReader("C:\\fileop\\myfile.txt");
		int i;
		while((i = mFr.read()) != -1)
			System.out.print((char) i);
		mFr.close();
	}
}

