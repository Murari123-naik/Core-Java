package practice;


public class abstractconcepts extends abstract_concept {

	public static void main(String[] args) {
		
		abstractconcepts abs =new abstractconcepts();
		abs.fly();
		abs.bark();
		abs.makesoud();

	}

	public void fly() {
		System.out.println("birds are flying");
		
	}

	public void bark() {
		System.out.println("dogs are barking");
		
		
	}

}
