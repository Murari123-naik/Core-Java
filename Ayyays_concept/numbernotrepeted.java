package Ayyays_concept;

public class numbernotrepeted {

	public static void main(String[] args) {
		
		int[] num= {1,4,3,1,2,5,6,6};
	
		for(int i=0;i<num.length;i++) {
			
			boolean repeted=false;
			
			for(int j=0;j<num.length;j++) {
				if(i !=j && num[i]==num[j]) {
					repeted=true;
					break;
				}
			}
			if(!repeted) {
				System.out.println(num[i]);
			}
		}
		
		
	}

}
