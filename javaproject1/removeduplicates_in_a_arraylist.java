package javaproject1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicates_in_a_arraylist {

	public static void main(String[] args) {
		
		
		ArrayList<String> a= new ArrayList();
		
		a.add("Murari");
		a.add("Murari");
		a.add("Naik");
		a.add("Mango");
		
		System.out.println(a);
		
		Set<String> H = new LinkedHashSet(a);
		
		System.out.println(H);

	}

}
