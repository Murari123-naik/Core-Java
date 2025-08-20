package javaproject1;

public class reverse_String {

	public static void main(String[] args) {
		String s="Murari";
		String r="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			 r=ch+r;
		}
		System.out.println(r);

	}

}
