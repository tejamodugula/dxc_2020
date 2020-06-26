package JavaIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInp {
	public static void main(String[] args) 
	{
			try
			{
				FileInputStream mFis = new FileInputStream("C:\\fileop\\\\myfile.txt");
				int i = mFis.read();
				System.out.println((char) i);
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
