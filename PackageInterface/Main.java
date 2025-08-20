package PackageInterface;

abstract class Marge_abstract_interfaces implements Interface1,Interface2 {
	
	
	public void Animal() {
		System.out.println("Animals World");
	}
	
}
	
	class Marge_All extends Marge_abstract_interfaces {
		
		public void Dog() {
			System.out.println("Dog is barking");
		}
		
	}
	
	
	class Main{
	public static void main(String[] args) {
		
		Marge_All marge = new Marge_All();
		
		marge.Animal();
		marge.Dog();
	}
	}


