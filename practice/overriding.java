package practice;

class grand{
	void fly() {
		System.out.println("bards are flying");
	}
}
class child extends grand{
	void fly() {
		System.out.println("dog is barking");
	}
}
public class overriding {
	
public static void main(String[] args) {
		
		child ch= new child();
		grand gr=new grand();
		
		ch.fly();
		gr.fly();
			

}
}
