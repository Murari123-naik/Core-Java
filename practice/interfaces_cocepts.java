package practice;

public class interfaces_cocepts implements inter,birds {

	
	public void bark() {
		System.out.println("birds are flying high");
		
	}

	
	public void fly() {
		System.out.println("dogs are barking more");
		
	}
	
	
	public static void main(String[] args) {
		interfaces_cocepts inter=new interfaces_cocepts();
		inter.bark();
		inter.fly();
	}

}
