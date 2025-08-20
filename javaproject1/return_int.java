package javaproject1;

public class return_int {

	public static void main(String[] args) {
		return_int re=new return_int();
//		int b=re.upcasting();
//		System.out.println(b);
		
		int a=re.upcasting1();
		System.out.println(a);
		
		double b=re.upcasting2();
		System.out.println(b);

	}
	public static int upcasting1() {
		
		double a= 10.0;
		return (int) a;
	}
	
   public static double upcasting2() {
		
		int b= 10;
		return (double) b;
	}

}
