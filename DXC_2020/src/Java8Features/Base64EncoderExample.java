package Java8Features;

import java.util.Base64;

public class Base64EncoderExample 
{

			public static void main(String[] args) 
			{
				
				/********** Byte Data Getting Encoded   ********************/
				// Getting the Encoder from Java
				Base64.Encoder encoder = Base64.getEncoder();
				// Creating Byte Array
				byte byteArray[] = {1,2};
				// Encoding byte array
				byte byteEncArray[] = encoder.encode(byteArray);
				System.out.println("Encoded Byte Array is "+byteEncArray);
				// creating a byte array to track how many number of bytes are encoded
				byte byteArray1[] = new byte[5];
				int counter = encoder.encode(byteArray, byteArray1); // It will return the number of bytes written
				System.out.println("No of bytes written are "+counter);
				
			}
}
