package javaproject1;


public class second_higestnubmer {
	
	public static void main(String[] args) {
		
		int n[]= {2,5,3,1,8,7,9};
		
		int t=n.length;	
		int temp;
		
		for(int i=0;i<t;i++) {
			
			for(int j=i+1;j<t;j++) {
				
				if(n[i]>n[j]) {
				
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;		
							
			}				
			}	
			}
		 System.out.println(n[t-2]);	
		n[t-2]=0;
		 System.out.println(n[t-2]);	
		
	}

}
