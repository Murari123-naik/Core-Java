package javaproject1;

public class reverse_a_string_same_position {

	public static void main(String[] args) {
		String s="My name is murari";
		String word[]=s.split(" ");
		String reverse="";
		
		for(int i=0;i<word.length;i++) {
			String r=word[i];
			
			String temp="";
			for(int j=r.length()-1;j>=0;j--) {
				char ch=r.charAt(j);
				
				temp=temp+ch;
			}
			reverse=reverse+temp+" ";
			
		}
		
		System.out.print(reverse);
	}

}
