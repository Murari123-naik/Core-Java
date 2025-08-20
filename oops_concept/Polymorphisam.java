package oops_concept;

public class Polymorphisam {
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b, int c) {
		return a-b-c;
	}
	public double  multi(double a, double b) {
		return a*b;
	}

	public static void main(String[] args) {
		
		
		Polymorphisam poly=new Polymorphisam();
		System.out.println(poly.add(10, 20));
		System.out.println(poly.sub(10, 20, 30));
		System.out.println(poly.multi(20, 30));

		
	}

}

