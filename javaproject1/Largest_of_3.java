package javaproject1;

public class Largest_of_3 {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		int c=15;
		
		int d;
		
		if(a>=b && a>=c) {
			d=a;
		}else if(b>=a && b>=c) {
			d=b;
		}
		else {
			d=c;
		}
		
		System.out.println("Largest value is: "+d);

	}

}
