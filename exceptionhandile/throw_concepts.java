package exceptionhandile;

public class throw_concepts {
	
	public static void checkage(int Age) {
		if(Age<18) {
			throw new ArithmeticException("Not eligibule for vote");
		}
		else if(Age>18) {
			throw new NullPointerException("Eligibule for vote");
			
		}
		else if(Age==18) {
			throw new NumberFormatException("Eligibule for vote");
		}
		else {
			System.out.println("Not in voter list");
		}
	}

	public static void main(String[] args) {
		throw_concepts tc=new throw_concepts();
		try {
		tc.checkage(76);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		try {
			tc.checkage(4);
			}
			catch(NullPointerException  e) {
				e.printStackTrace();
				
			}
		try {
			tc.checkage(25);
			}
			catch(NumberFormatException e) {
				e.printStackTrace();
				
			}
		
		

	}

}
