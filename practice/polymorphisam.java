package practice;

public class polymorphisam {
	
	public static void add() {
		System.out.println("Hello world");
	}
	public static void add1() {
		System.out.println("Hello welcome");
	}
	
	
	public static void main(String[] args) {
		
		polymorphisam poly = new polymorphisam();
		
		poly.add1();
		poly.add();
		
	}

}
