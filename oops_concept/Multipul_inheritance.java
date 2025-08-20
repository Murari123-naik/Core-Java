package oops_concept;


interface Animalss {
	void eat();
	
}
interface bird{
	void fly();
}
class Eagle implements Animalss,bird{
	public void eat() {
		System.out.println("Animal makes sound");
	}
	public void fly() {
		System.out.println("Birds flaying");
	}
}

public class Multipul_inheritance {

	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		eagle.eat();
		eagle.fly();
		

	}

}
