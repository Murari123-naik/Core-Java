package Strings;

public class removeduplicatesinanumber {

	public static void main(String[] args) {
		
		int[] n= {2,3,5,1,4,5,2,-1};
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				
				if(n[i]==n[j]) {
					
					n[j]=-1;
				}				
			}			
			if(!(n[i]==-1)) {
				System.out.print(n[i]);
				
			}
		}
		
	}

}
