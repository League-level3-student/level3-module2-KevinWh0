package _00_Sorting_Algorithms;

import java.sql.Time;
import java.util.Random;
import java.util.TimeZone;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm.
	
	
	boolean inOrder(int[] array) {
		int last = 0;
		boolean InOrder = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > last) {
				InOrder = true;
			}else {
				InOrder = false;
				return false;
			}
		}
		return true;
	}
	
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		Random rand = new Random();
		int counter = 0;
		while(inOrder(array)) {
			int rand1 = rand.nextInt(array.length/2);
			int rand2 = rand.nextInt(array.length/2);
			if(array[rand1] > array[rand2]) {
				int ram = array[rand2];
				array[rand2] =  array[rand1];
				array[rand1] = ram;
			}
			
			counter++;
			System.err.println("Itteration number "+counter);
			display.updateDisplay();
		}
		

	}
}
