package oops_concept;

public class Child_Constructor extends Parent_Constructor {
	
	String childname="Murari";
	Child_Constructor(){
		super();
		System.out.println("Child constructor");
	}
	
	public void main() {
		System.out.println(parentname);
		System.out.println(childname);
	}
	
	
public static void main(String[] args) {
	
	Child_Constructor child = new Child_Constructor();
	
	child.main();
	
}
}
