package Ayyays_concept;

public class countnumbers {

	public static void main(String[] args) {
		int[] num= {1,4,3,1,2,5,6,6};
		
		int count;
		
		for(int i=0;i<num.length;i++) {
			
			 count=1;
			
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
					num[j]=-1;
					
				}
			}
			
			if(num[i]!=-1) {
				System.out.println(num[i]+"----->"+count);
			}
		}
	}

}
