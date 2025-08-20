package PackageInterface;

public class Marge_interfaces implements Interface1,Interface2 {

	
	public void Dog() {
		
		System.out.println("Dog barks");
		
	}

	
	public void Animal() {
		
		System.out.println("Animals world");
		
		
	}
	
	public static void main(String[] args) {
		
		Marge_interfaces marge = new Marge_interfaces();
		marge.Dog();
		marge.Animal();
		
	}
	

}
