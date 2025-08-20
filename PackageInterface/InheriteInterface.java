package PackageInterface;

public class InheriteInterface implements Interface3 {
		
		public void Animal() {
			System.out.println("Animal word");
			
		}
		
		public void Dog() {
			System.out.println("Dog barks");
					
		}
		
		public void Cat() {
		
			System.out.println("Cat Meow");
					
		}
			
		public static void main(String[] args) {
			InheriteInterface inharit = new InheriteInterface();
			inharit.Animal();
			inharit.Dog();
			inharit.Cat();
			
		}


}



