package Strings;

public class Stringbuffers {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Murari");
		b.reverse();	
		System.out.println(b);
		
		b.append(" Naik");
		System.out.println(b);
		
		b.chars();
		System.out.println(b);
		
		b.delete(2, 4);
		System.out.println(b);
		
		b.indexOf("Naik");
		
		System.out.println(b);
	}
	
}
