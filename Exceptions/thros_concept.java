package Exceptions;

public class thros_concept {
	
	public void devide() throws ArithmeticException{
		int a=10/0;
	}
	
	public static void main(String[] args) {
		thros_concept tc= new thros_concept();
		try {
		tc.devide();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Devided successully");
		
	}

}
