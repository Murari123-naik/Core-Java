package javaproject1;

public class findduplicates {

	public static void main(String[] args) {
		
		int []num= {1,0,1,2,4,1,5,6,2};
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]==-1) {
				continue;
			}
			
			int count=1;
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]) {
					count++;
					
					num[j]=-1;
				}
			}
			if(count>1) {
				System.out.println(num[i]);
				
			}
		}
		
		

	}

}
