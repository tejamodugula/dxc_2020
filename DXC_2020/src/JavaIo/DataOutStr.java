package JavaIo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutStr
{
	// DataOutputStream Class allows an aplication to write primitive data types to output stream
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream mFout = new FileOutputStream("C:\\fileop\\testout.txt");
		DataOutputStream mDouts = new DataOutputStream(mFout);
		mDouts.write(97);
		mDouts.write(97);
		mDouts.write(97);
		mDouts.write(97);
		
		mDouts.flush();
		mDouts.close();
		System.out.println("Written Successfully");
	}

}
