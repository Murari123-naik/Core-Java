package javaproject1;

public class Accending_order {

	public static void main(String[] args) {
		int[] n= {2,6,5,7,3,1};
		int temp;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				
				if(n[i]>n[j]) {
					
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
				
			}
             System.out.print(n[i]+" ");
		}
		
		
	}

}
