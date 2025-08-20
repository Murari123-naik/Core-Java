package exceptionhandile;

import java.io.FileWriter;
import java.io.IOException;

public class Ioexceptionhandle {

	public static void main(String[] args) {
		
		try {
		
		FileWriter fw = new FileWriter("./fil");
		}catch(IOException e) {
			
		}
		finally {
			System.out.println("succesfully Handled IO exception");
		}
		

	}

}
