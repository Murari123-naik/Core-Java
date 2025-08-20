package javaproject1;

public class countdigits {
	public static void main(String[] args) {
        int a[] = {1, 2, 2, 4, 3, 1, 4};
        
        for(int i=0;i<a.length;i++) {
        	int count=1;
        	boolean allreadycounted=false;
        	for(int j=0;j<i;j++) {
        		if(a[i]==a[j]) {
        		allreadycounted=true;
        		break;
        	}
        	}
        	if(allreadycounted) {
            	continue;
        }
        	for(int j=i+1;j<a.length;j++) {
            	if(a[i]==a[j]) {
            		count++;
        
        }
        
        	}
        	   
        System.out.println(a[i]+"   "+"occurance are"+"   "+count);
       
        }
    
}
}



