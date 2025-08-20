package Ayyays_concept;

public class notrepeted_number {

	public static void main(String[] args) {
		int[] a = {1,2,3,1,2,3,5};
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			
			for(int j=1+i;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					count++;
					
					a[j]=0;
				}
			}
			if(a[i]!=0) {
				
				System.out.println(a[i]+"  "+count);
				
			}
		}
		

	}

}
