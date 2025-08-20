package Exceptions;

public class Forloopfinaly {
	
	 public static void main(String[] args) {
	        for (int i = 0; i < 3; i++) {
	            if (i == 0) {
	                try {
	                    System.out.println("First iteration: try block");
	                    
	                } finally {
	                    System.out.println("First iteration: finally block");
	                }
	            } else {
	                System.out.println("Iteration " + i + ": normal flow");
	            }
	        }
	    }

}
