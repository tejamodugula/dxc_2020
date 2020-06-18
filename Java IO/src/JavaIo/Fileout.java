package JavaIo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner; 

public class Fileout 
{
	
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter the Path");
			Scanner mScanner = new Scanner(System.in);
			String mPath = mScanner.next();
//			FileOutputStream<String> mFout = new FileOutputStream("F:\\java_files\\myfile.txt");
			FileOutputStream  mFout = new FileOutputStream(mPath);
			mFout.write(100);
			System.out.println("Successfully written in File");
			mFout.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}