package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	static boolean intArraySorted(int arry[]) {

		int last = Integer.MIN_VALUE;
		for (int i = 0; i < arry.length; i++) {

			if (!(last <= arry[i])) {
				return false;
			}

			last = arry[i];
		}

		return true;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	static boolean doubleArraySorted(double arry[]) {

		double last = Double.MIN_VALUE;
		for (int i = 0; i < arry.length; i++) {

			if (!(last <= arry[i])) {
				return false;
			}

			last = arry[i];
		}

		return true;
	}
	
	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	static boolean charArraySorted(char arry[]) {

		double last = Integer.MIN_VALUE;
		for (int i = 0; i < arry.length; i++) {

			if (!(last <= Character.toLowerCase(arry[i]))) {
				return false;
			}

			last = arry[i];
		}

		return true;
	}
	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

	static boolean stringArraySorted(String arry[]) {

		double last = Integer.MIN_VALUE;
		for (int i = 0; i < arry.length; i++) {

			
		}

		return true;
	}
	
}
