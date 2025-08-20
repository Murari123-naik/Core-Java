package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class collectionstopic {

	public static void main(String[] args) {
		
		
		ArrayList arr=new ArrayList();
		
		arr.add("Apple");
		arr.add("Bananna");
		arr.add("grapes");
		arr.add("Bananna");
		
		System.out.println(arr);
		
		
		Set s= new HashSet(arr);
		System.out.println(s);

	}

}
