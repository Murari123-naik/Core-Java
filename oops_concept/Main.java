package oops_concept;

class Vehicle {
    int speed = 50;

    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    void displaySpeed() {
        System.out.println("Speed from Vehicle: " + speed);
    }
}

class Car extends Vehicle {
    int speed = 100;

    Car() {
        super(); // Calls Vehicle's constructor
        System.out.println("Car constructor called");
    }

    void showDetails() {
        System.out.println("Speed from Car: " + this.speed); // refers to Car's speed
        System.out.println("Speed from Vehicle: " + super.speed); // refers to Vehicle's speed
        super.displaySpeed(); // calls method from Vehicle
    }
}

public class Main {

	public static void main(String[] args) {
		Car c = new Car();
        c.showDetails();
		
	}

}
