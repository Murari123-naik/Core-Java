package Ayyays_concept;

public class reversstring {

	public static void main(String[] args) {
		
		String s="Simplify3x";
		String rev="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			rev=ch+rev;
			
			
		}
		System.out.println(rev);

	}

}
