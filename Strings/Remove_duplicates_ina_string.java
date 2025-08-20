package Strings;

public class Remove_duplicates_ina_string {
	
	public static String removeduplicate(String s) {
		
		char[] ch=s.toCharArray();
		String results="";
		
		for(int i=0;i<ch.length;i++) {
			
			boolean isduplicate=false;
			
			for(int j=0;j<results.length();j++) {
				
				if(ch[i]==results.charAt(j)) {
					isduplicate=true;
					break;
				}			
			}
			if(!isduplicate) {
				results=results+ch[i];
			}
		}

        return results;	
	}
	public static void main(String[] args) {
		String s="Murari";
		 String output = removeduplicate(s);
		System.out.println(s);
		System.out.println(output);	
	}

}
