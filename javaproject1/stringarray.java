package javaproject1;

public class stringarray {

	public static void main(String[] args) {
		
		
		String str="I am from Bengaluru";

		String []s=str.split(" ");
		
		for(int i=0;i<s.length;i++) {
			String word=s[i];
			
				System.out.println(word);
		}

	}

}
