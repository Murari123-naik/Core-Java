package Exceptions;

public class throw_concept {
	
	    public void checkAge(int age) throws Exception {
	        if (age < 18) {
	            throw new ArithmeticException("No voter ID");
	        } else if (age == 18) {
	            throw new Exception("Apply for voter ID");
	        } else if (age > 65) {
	            throw new NumberFormatException("Senior citizen");
	        } else {
	            System.out.println("Eligible for voter ID");
	        }
	    }

	    public static void main(String[] args) {
	        ThrowConcept tc = new ThrowConcept();

	        int[] testAges = {18, 25, 68};

	        for (int age : testAges) {
	            try {
	                System.out.println("\nChecking age: " + age);
	                tc.checkAge(age);
	            } catch (Exception e) {
	                System.out.println("Exception caught: " + e.getMessage());
	            }
	        }
	    }


}
