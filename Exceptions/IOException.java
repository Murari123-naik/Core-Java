package Exceptions;

import java.io.FileWriter;

public class IOException {
	
	    public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("C://Murari");
	            
	            writer.write("Hello, this is an example of IOException.");
	            writer.close();
	            
	            System.out.println("File written successfully.");
	            
	        } catch (Exception e) {
	            System.out.println("IOException: " + e);
	        }
	    }
	
}
