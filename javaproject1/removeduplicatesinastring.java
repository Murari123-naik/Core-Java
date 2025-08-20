package javaproject1;

public class removeduplicatesinastring {

	public static void main(String[] args) {
		
		String s="Murari";
		String n="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(n.indexOf(ch)==-1) {
				
				n=n+ch;
				
			}
		}
		
		System.out.println(s);
		System.out.println(n);
	}

}
