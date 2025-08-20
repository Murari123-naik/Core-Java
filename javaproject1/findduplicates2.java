package javaproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class findduplicates2 {

	public static void main(String[] args) {
		
		int []num= {1,0,1,2,4,1,5,6,2};
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		for(int i : num)
		{
			s.add(i);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>(s);
		
		al.sort(Collections.reverseOrder());
		System.out.println(al);
		
		System.out.println(al.get(1));
		
	  al.set(1, 0);
	  
	  System.out.println(al);
	  
	  System.out.println(al.get(1));
		
	
		
		
		
		
		
		
		

	}

}
