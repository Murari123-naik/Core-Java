package javaproject1;

import java.util.Arrays;

public class anagram {
	
	public static boolean AnagramsSorting(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
    return false;
}

        char[] charArray1 = str1.toLowerCase().toCharArray(); 
        char[] charArray2 = str2.toLowerCase().toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		
		return Arrays.equals(charArray1, charArray2);
		}
		
		public static void main(String[] args) {
		System.out.println(AnagramsSorting("listen", "silent")); 
		System.out.println(AnagramsSorting("triangle", "integral")); 
		System.out.println(AnagramsSorting("hello", "world")); 
		System.out.println(AnagramsSorting("Debit Card", "Bad Credit")); 
		}
		
		
		}
