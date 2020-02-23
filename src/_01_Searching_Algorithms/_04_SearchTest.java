package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] e = {"o","i","u","l"};
		assertEquals(1, _00_LinearSearch.linearSearch(e, "i"));
		
		String[] e1 = {"o","i","u","l"};
		assertEquals(3, _00_LinearSearch.linearSearch(e1, "l"));
		
		String[] e2 = {"p","h","k","n"};
		assertEquals(0, _00_LinearSearch.linearSearch(e2, "p"));
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] e = {0,1,2,3,4,5,6};
		
		assertEquals(2, _01_BinarySearch.binarySearch(e, 0, e.length-1, 2));
		
		int[] e1 = {-1,1,2,3,4,5,6};
		
		assertEquals(2, _01_BinarySearch.binarySearch(e1, 0, e.length-1, 2));
		
		int[] e2 = {4,5,6,7,8,9,10};
		
		assertEquals(0, _01_BinarySearch.binarySearch(e2, 0, e.length-1, 4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] e = {1,2,3,4,5,6};
		
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(e, 1));
		
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(e, 2));

		assertEquals(4, _02_InterpolationSearch.interpolationSearch(e, 5));

	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		
		int[] e = {1,2,3,4,5,6};
		
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(e, 1));
		
		int[] e1 = {-1,2,3,4,5,6};
		
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(e1, -1));
		
		int[] e2 = {1,2,3,4,5,60};
		
		assertEquals(5, _03_ExponentialSearch.exponentialSearch(e2, 60));
	}
}
