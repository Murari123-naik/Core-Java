package javaproject1;

public class Square_sorting {

	public static void main(String[] args) {
		int[] n= {-4,-1,0,3,10};
		
		for(int i=0;i<n.length;i++) {
			n[i]=n[i]*n[i];
					
		}
			for(int i=0;i<n.length;i++) {
					for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					int temp=0;
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
				}
			}
					System.out.print(n[i]+" ");
			
		}
		
		
	}

}
