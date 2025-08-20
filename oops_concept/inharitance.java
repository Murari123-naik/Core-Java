package oops_concept;

class parent {
public void  a() {
	System.out.println("print");
}
}
class chaild extends parent{
public void b() {
System.out.println("print2");
}
}


public class inharitance {
	
	public static void main(String[] args) {
		
		chaild ch= new chaild();
		ch.a();
		ch.b();

	}

}

