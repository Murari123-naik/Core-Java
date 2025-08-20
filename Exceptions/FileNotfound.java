package Exceptions;
import java.io.*;
public class FileNotfound {
	

	
	public static void main(String[] args) {
	try {
		FileInputStream	file = new FileInputStream("C://Murari");
	
	} catch (FileNotFoundException e) {
		
	System.out.println("File not found: " + e);
	}
	
	}

}
