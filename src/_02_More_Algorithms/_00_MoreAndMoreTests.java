package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {
	multiply mult = new multiply();

	@Test
	  public void MultTest() {

		
	    assertEquals("10 x 0 = 0", mult.multiply(10, 0)); 
	    assertEquals("10 x 10 = 100", mult.multiply(10, 10));
	    assertEquals("8 x 11 = 88", mult.multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {

	    assertTrue(mult.isPrime(3));
	    assertTrue(mult.isPrime(5));
	    assertTrue(mult.isPrime(541));
	    assertFalse(mult.isPrime(4));
	    assertFalse(mult.isPrime(12));
	    assertFalse(mult.isPrime(527));

	  }
//
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

private boolean isSquare(int i) {
	// TODO Auto-generated method stub
	for (int j = 0; j <= i; j++) {
		if(j * j == i) return true;
	}
	

	return false;
}

	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }

	private boolean isCube(int i) {
		for (int j = 0; j <= i; j++) {
			if(j * j * j == i) return true;
		}
		

		return false;
	}





}
