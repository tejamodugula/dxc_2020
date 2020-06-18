package JavaIo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
// DataInputStream Class allows program to read primitive data from the input Stream
public class DataInpStr
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream mIs = new FileInputStream("C:\\fileop\\testout.txt");
		DataInputStream mDis = new DataInputStream(mIs);
		int count = mIs.available();
		byte[] array = new byte[count];
		mDis.read(array);
		for(byte bt: array)
			System.out.println((char) bt);
	}
}
