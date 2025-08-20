package oops_concept;

public abstract class abstract_class {
	
	public abstract void speed();
	void sleep() {
        System.out.println("Sleeping...");
    }

}

class childclass extends abstract_class{
	
	public void speed() {
		System.out.println("Speed is 100");
		
	}


public static void main(String[] args) {
	childclass abstract_class= new childclass();
	
	abstract_class.speed();
}

}