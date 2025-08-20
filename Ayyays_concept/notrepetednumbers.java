package Ayyays_concept;

public class notrepetednumbers {
	
	

	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 1, 2, 3, 5};
	        
	        for (int i = 0; i < a.length; i++) {
	            boolean isRepeated = false;
	            
	            for (int j = 0; j < a.length; j++) {
	                if (i != j && a[i] == a[j]) {
	                    isRepeated = true;
	                    break;
	                }
	            }
	            
	            if (!isRepeated) {
	                System.out.println(a[i]);
	            }
	        }
	    }
	


}
