package javaproject1;

public class polyndrime {

	public static void main(String[] args) {
			
		int num=121;
		int orgnum=num;
		int reverse=0;
		
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		if(orgnum==reverse) {
			System.out.println("number is polyndrome");
		}
		else {
			System.out.println("number is not a polyndrome");
		}

	}

}



