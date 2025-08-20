package Ayyays_concept;

public class not_repeted {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,1,2,3,5};
		
		for(int i=0;i<a.length;i++) {
			
			boolean repeted = false;
			
			for(int j=0;j<a.length;j++) {
				if( i!=j && a[i]==a[j]) {
					
					repeted =true;
					break;				
				}
			}
			if(!repeted) {
				System.out.println(a[i]);
			}
		}
	}
}
