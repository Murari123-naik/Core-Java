package javaproject1;

import java.util.Arrays;

public class smalestpositiveinteger {

	public static void main(String[] args) {
		int[] arr = {5, -1, 0, 4, -4, 2}; 
						
		int smalestnumber=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 && arr[i]<smalestnumber) {
				smalestnumber=arr[i];
			}
		}
		
		if(smalestnumber==Integer.MAX_VALUE) {
			System.out.println("Smalest positive integer not fount");
		}else {
			System.out.println("smalest positive numbe is"+"  "+smalestnumber);
		}
	}

}
