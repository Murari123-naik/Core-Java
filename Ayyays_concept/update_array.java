package Ayyays_concept;

public class update_array {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,1,2,3,5};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=1+i;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[i]);
				}
			}
			
		}	

	}

}
