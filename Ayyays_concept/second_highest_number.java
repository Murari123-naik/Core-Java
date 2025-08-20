package Ayyays_concept;

public class second_highest_number {

	public static void main(String[] args) {
		
		int []a= {4,5,2,4,6,8,7};
		
		int l=a.length;
		
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=1+i;j<a.length;j++) {
				
				if(a[i]>a[j]) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}		
		}
		
		System.out.println(a[l-2]);
	}

}
