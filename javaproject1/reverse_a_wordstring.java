package javaproject1;

public class reverse_a_wordstring {

	public static void main(String[] args) {
		String s="My name is murari";
		//String word[]=s.split(" ");
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--) {
			 
			reverse=reverse+s.charAt(i);
						
		}
		
		System.out.print(reverse);
		
	}
		
}

