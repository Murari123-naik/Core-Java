package javaproject1;

public class fibonasi_series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=2;i<10;i++) {
			
			int d=a+b;
			
			a=b;
			b=d;
						
			System.out.print(d+" ");
			
		}
		
	}

}
