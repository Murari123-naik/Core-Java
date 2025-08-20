package javaproject1;

public class remove_duplicates {

	public static void main(String[] args) {
		int []num= {1,0,1,2,4,1,5,6,2};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					num[j]=-1;
				}
				
			}
			if(num[i]!=-1) {			
				
			System.out.print(num[i]);
			
			}		}
	}

}
