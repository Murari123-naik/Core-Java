package javaproject1;

import java.util.Scanner;

public class Stop_at_zero {

	public static void main(String[] args) {
		int n=1;
		while(n!=0) {
			System.out.println("Enter number");
			Scanner s=new Scanner(System.in);
			n= s.nextInt();
			//System.out.println(n);
		}
	System.out.println("Enterd Zero please enter positive numbers");

	}

}



