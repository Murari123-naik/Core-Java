package javaproject1;

public class Armstrong_number {

	public static void main(String[] args) {
		int n=153;
		int org=n;
		double result=0;
		int num=String.valueOf(n).length();
		
		
		while(n>0) {
			int digit=n%10;
			result =result+Math.pow(digit, num);
			n=n/10;
		}
		 if (result == org) {
	            System.out.println(org + " is an Armstrong number.");
	        } else {
	            System.out.println(org + " is NOT an Armstrong number.");
	        }
		
		

	}
}

