package practice;

class a{
	public  void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	
}
class b extends a{
	public  void sub() {
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
	
}


public class oppsconcepts {
	public static void main(String[] args) {
		b B=new b();
		
		
		B.add();
		B.sub();
		
	}

	

}
