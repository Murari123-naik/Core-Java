package Exceptions;

public class ClassNotFound {
	
	
	 public static void main(String[] args) {
	        try {
	            Class.forName("MyClass");
	        } catch (ClassNotFoundException e) {
	            System.out.println("ClassNotFoundException: " + e);
	        }
	    }

}
