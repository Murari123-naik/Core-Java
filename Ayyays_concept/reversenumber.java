package Ayyays_concept;

public class reversenumber {

	public static void main(String[] args) {
		String a= "Murari";
		String s="";
		//String [] word=a.split("");
		
		
		for(int i=0;i<a.length();i++) {
			
			char ch=a.charAt(i);
			
			s=ch+s;
			
		}
		
		System.out.println(s);
	}

}
