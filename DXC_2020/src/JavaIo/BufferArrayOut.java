package JavaIo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class BufferArrayOut 
{

	// ByteArrayOutputStream class is used to write Common data into multiple files
		public static void main(String[] args) throws Exception
		{
			FileOutputStream mFout1 = new FileOutputStream("C:\\fileop\\file1.txt");
			FileOutputStream mFout2 = new FileOutputStream("C:\\fileop\\file2.txt");

			ByteArrayOutputStream mBouts = new ByteArrayOutputStream();
			mBouts.write(64);
		
			mBouts.writeTo(mFout1);
			mBouts.writeTo(mFout2);
			
			mBouts.flush();
			mFout1.close();
			mFout2.close();
			System.out.println("Written Data Successfully in Files");
		}

	}
