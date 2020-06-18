package JavaIo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInp 
{

	// BufferedInputStream class is usedt read information from stream

		public static void main(String[] args) throws Exception 
		{
			FileInputStream mFis = new FileInputStream("C:\\fileop\\outputfile.txt");
			BufferedInputStream mBis = new BufferedInputStream(mFis);
			int i;
			while((i=mBis.read()) != -1)
				System.out.print((char) i);
			mFis.close();
			mBis.close();
		}

}
