package javaproject1;

public class smalestpostive_digti {
	public static void main(String[] args) {
        int[] arr = {5, -1, 0, 4, -4, 2}; // Given array
        int smallestPositive = Integer.MAX_VALUE; // Set to the largest possible value initially
        
        // Loop through the array to find the smallest positive number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < smallestPositive) {
                smallestPositive = arr[i]; // Update smallestPositive if a smaller positive number is found
            }
        }
        
        // Check if we found a positive number or not
        if (smallestPositive == Integer.MAX_VALUE) {
            System.out.println("No positive number found in the array.");
        } else {
            System.out.println("The smallest positive number in the array is: " + smallestPositive);
        }
    }
}



