package javaproject1;

public class polyndrome {

	public static void main(String[] args) {
		
		int n=1234321;
		int org=n;
		int reverse=0;
		
		while(n!=0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n/=10;				
		}
		if(org==reverse) {
			System.out.println("Number is polyndrome");
		}
		else {
			System.out.println("Number is not polyndrome");
		}

	}

}
