package Strings;

public class removeduplicates {

	public static void main(String[] args) {
		
		String a="Murari";
		
		String results="";
		
		char[] ch=a.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			boolean b=false;
			
			for(int j=0;j<results.length();j++) {
				if(ch[i]==results.charAt(j)) {
					b=true;
				}
			}
			if(!b) {
				results=results+ch[i];
			}
		}
		
		
		System.out.println("Original number  " + a);
		
		System.out.println("Modifyed    "+ results);

	}

}
