package Exceptions;

public class NumberFormate {
	
	 public static void main(String[] args) {
	        try {
	            int num = Integer.parseInt("abc");
	            
	        } catch (NumberFormatException e) {
	        	
	            System.out.println("NumberFormatException: " + e);
	        }
	    }

}
