package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_list {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add("23");
		arr.add("1");
		arr.add("Hello");
		arr.add("Hello");
		arr.add("23");
		arr.add("23");
		arr.add("1b");
		arr.add("abcd");
		arr.add("*");
		
		int n=arr.size();
		
		Collections.sort(arr); 
		
		System.out.println(arr);
		
		Collections.sort(arr,Collections.reverseOrder());
		
//		arr.set(2, "welcome");
		System.out.println(arr);
		
		arr.retainAll(Collections.singleton(23));
		
		System.out.println(arr);
		
		
		System.out.println(n);
		
			
		

	}

}
