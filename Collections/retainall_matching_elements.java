package Collections;

import java.util.ArrayList;

public class retainall_matching_elements {

	public static void main(String[] args) {
        ArrayList arr1=new ArrayList();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		
		ArrayList arr2 = new ArrayList();
		
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		
		arr2.retainAll(arr1);
		
		System.out.println(arr2);

	}

}
