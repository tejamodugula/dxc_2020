package JavaIo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOut 
{
public static void main(String[] args)
{
	try 
	{
		FileOutputStream f1=new FileOutputStream("C:\\fileop\\outputfile.txt");
		BufferedOutputStream b1= new BufferedOutputStream(f1);
		String message = "Hi Output classes how are you all ?";
		byte b[] = message.getBytes();
			b1.write(b);
			System.out.println("successfull");
			b1.close();
			f1.close();
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


