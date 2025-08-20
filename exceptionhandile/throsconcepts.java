package exceptionhandile;

public class throsconcepts {
	
	public static void devide() throws ArithmeticException {
		int a=10/0;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		throsconcepts tc=new throsconcepts();
		try {
		tc.devide();
		}catch(ArithmeticException e) {
			
		}

	}

}
