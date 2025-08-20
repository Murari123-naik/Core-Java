package Exceptions;

public class Interupted {
	
	
	  public static void main(String[] args) {
	        try {
	            System.out.println("Sleeping...");
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            System.out.println("InterruptedException: " + e.getMessage());
	        }
	    }

}
