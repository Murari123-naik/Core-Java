package javaproject1;

public class arraylargestnumber {

	public static void main(String[] args) {
		
		int n[] = {1,3,5,7,4,3,6};
		
		int a=n.length;
		
		int temp;
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
					
					
				}
			}
			
		}
		System.out.println(n[a-1]);
		

	}

}
