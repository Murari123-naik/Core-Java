package Exceptions;

public class ThrowConcept {
	
	
	public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("No voter ID");
        } else if (age == 18) {
            throw new NullPointerException("Apply for voter ID");
        } else if (age > 65) {
            throw new NumberFormatException("Senior citizen");
        } else {
            System.out.println("Eligible for voter ID");
        }
    }
	public static void main(String[] args) {
		
		ThrowConcept tc= new ThrowConcept();
		try {
			tc.checkAge(18);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			tc.checkAge(25);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			tc.checkAge(68);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
