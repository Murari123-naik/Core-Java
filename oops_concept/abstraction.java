package oops_concept;

abstract class Animal {
    abstract void makeSound();  // Abstract method (no body)

    void sleep() {  // Concrete method (has a body)
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class abstraction {
	public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Calls Dog's makeSound()
        myDog.sleep();     // Calls Animal's sleep()
    }

}


