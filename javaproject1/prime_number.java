package javaproject1;

public class prime_number {

	public static void main(String[] args) {
		
		int n=20;
		
		for(int i=2;i<=n;i++) {
			boolean isprime = true;
			
			for(int j=2;j<n/2;j++) {
				
				if(i%j==0) {
					isprime =false;
					break;
				}
				
			}
			if(isprime) {
				System.out.println(i);
				
			}
			
		}

	}

}


