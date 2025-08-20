package oops_concept;
class Animals{
	public void sound() {
		System.out.println("Animal makes sounds");
	}
}
class Dogs extends Animals{
	public void barks() {
		System.out.println("Dog barks");
	}
	
}
class Puppy extends Dogs{
	public void tail() {
		System.out.println("puppy tail");
	}
}

public class multilevel_inheritance {

	public static void main(String[] args) {
		Puppy puppy=new Puppy();
		puppy.sound();
		puppy.barks();
		puppy.tail();

	}

}
