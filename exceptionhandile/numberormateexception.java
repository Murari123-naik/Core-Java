package exceptionhandile;

public class numberormateexception {

	public static void main(String[] args) {
		try {
		String s="String";
		
		int n=Integer.parseInt(s);
		
		System.out.println(n);
		}catch(NumberFormatException e) {
			
		}
		System.out.println("NumberFormatException Handiled Successfully");

	}

}
