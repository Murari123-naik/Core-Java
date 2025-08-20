package Exceptions;

public class pointer {
	
	
	 public static void main(String[] args) {
		 	 
	        try {
	            String str = null;
	            str.length();
	            
	        } catch (Exception e) {
	            System.out.println("NullPointerException: " + e);
	        }
	    }

}
