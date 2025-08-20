package javaproject1;

public class outerclass {
	
	static class innerclass{
		
		static void details() {
			System.out.println("Inner class");
		}
		static int a=100;
	}
	
	public static void main(String[] args) {
		
		outerclass.innerclass.details();
		
		System.out.println("Print numbers "+ outerclass.innerclass.a);
	}

}
