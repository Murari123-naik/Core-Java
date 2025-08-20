package Ayyays_concept;

public class reverse_words {
	
	    public static void main(String[] args) {
	        String s = "Murari Naik";
	        
	        String[] words = s.split(" ");
	        String rev = "";
	        
	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            String reverse = "";
	            
	            for (int j = word.length() - 1; j >= 0; j--) {
	                reverse = reverse + word.charAt(j);
	            }
	            
	            rev = rev + reverse + " ";
	        }
	        
	        System.out.println("Reversed each word: " + rev.trim());
	    }
	


}
