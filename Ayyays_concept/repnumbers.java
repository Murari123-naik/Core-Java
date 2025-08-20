package Ayyays_concept;

public class repnumbers {
	
	public static void main(String[] args) {
		int[] num= {1,4,3,1,2,5,6,6};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					
					System.out.println(num[i]);
					
				}
			}
			
		}

	}

}
