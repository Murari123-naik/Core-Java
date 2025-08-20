package oops_concept;
class display {
	void name() {
	System.out.println("display the method");
}
}
class show extends display {
	void name() {
	System.out.println("show the result");
}
}
public class poly_overraiding {

	public static void main(String[] args) {
		
		show s=new show();
		s.name();
		
		
	}

}



