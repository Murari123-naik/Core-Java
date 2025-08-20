package javaproject1;

public class count_digits {
	
	    public static void main(String[] args) {
	        int a[] = {1, 2, 2, 4, 3, 1, 4};

	        // Find the unique elements and count their occurrences
	        for (int i = 0; i < a.length; i++) {
	            int count = 1;
	            boolean alreadyCounted = false;

	            // Check if this number was already counted in previous iterations
	            for (int j = 0; j < i; j++) {
	                if (a[i] == a[j]) {
	                    alreadyCounted = true;
	                    break;
	                }
	            }

	            if (alreadyCounted) {
	                continue;
	            }

	            // Count occurrences of a[i] in the array
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    count++;
	                }
	            }

	            System.out.println(a[i] + " appears " + count + " times.");
	        }
	    }
	}

