package exceptionhandile;

public class classnotfoundexceptionhandile {

	public static void main(String[] args) {
		try {
		
		Class.forName("testing");
		}catch(ClassNotFoundException e) {
			
		}
		System.out.println("Classnotfoundexception successfully handle");

	}

}
