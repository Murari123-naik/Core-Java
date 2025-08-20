package Ayyays_concept;

public class Array_foreachloop {

	public static void main(String[] args) {
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int[] row : myNumbers) {
		  for (int i : row) {
		    System.out.println(i);
		  }
		}

	}

}

