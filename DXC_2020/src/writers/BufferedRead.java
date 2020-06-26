package writers;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedRead 
{
public static void main(String[] args) throws Exception 
{
	FileReader mFr = new FileReader("C:\\fileop\\myfile.txt");
	BufferedReader b1=new BufferedReader(mFr);
	int i;
	while((i = b1.read()) != -1)
	{
		System.out.println((char) i );
	}
}
}
