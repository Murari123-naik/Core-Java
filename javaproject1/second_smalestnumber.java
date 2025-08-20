package javaproject1;

public class second_smalestnumber {

	public static void main(String[] args) {
		
		int n[]= {4,5,1,6,3,2,9,4};
		
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
		System.out.println(n[2]);

	}

}
