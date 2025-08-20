package javaproject1;

public class removeduplicates_in_a_array {

	public static void main(String[] args) {
		
		int a[]= {4,7,7,8,9,8};
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					
					a[j]=0;
				}
				
			}
			if(a[i]!=0) {
				System.out.println(a[i]);
			}
		}
		

	}

}
