package javaproject1;

public class count_numbers {
	public static void main(String[] args) {
	
	int a[]= {4,7,7,8,9,8};
	
	for(int i=0;i<a.length;i++) {
		int count=1;
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				count++;
				
				a[j]=-1;
			}
		}
		
		if(a[i]!=-1) {
			System.out.println(a[i]+"---- "+count);
		}
	}

}
}