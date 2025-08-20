package javaproject1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicatesin_arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> s=new ArrayList<String>();
		
		s.add("mango");
		s.add("Bananna");
		s.add("mango");
		s.add("bananna");
		
		System.out.println(s);
		
		Set<String> ss=new LinkedHashSet<String>(s);
		System.out.println(ss);
		
	}

}
