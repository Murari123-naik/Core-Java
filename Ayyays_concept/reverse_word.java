package Ayyays_concept;

public class reverse_word {

	public static void main(String[] args) {
		String s="Murari Naik";
		
		String[] word=s.split(" ");
		String rev="";
		
		for(int i=0;i<word.length;i++) {
			
			String revs=word[i];
			String reverse="";
			
			for(int j=revs.length()-1;j>=0;j--) {
				char re=revs.charAt(j);
				
				reverse=reverse+re;			
			
			}
			rev=rev+reverse+" ";
			
		}
		
		System.out.println(rev.trim());

	}

}
