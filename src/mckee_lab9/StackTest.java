/*
 * JungBok Cho
 * CPSC 5002, Seattle University
 * This is free and unencumbered software released into the public domain.
 */
package mckee_lab9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
/**
 * This is a program to test generic stack.
 * 
 * @author  Mike McKee
 * @version 1.0
 */
public class StackTest {
	/**
	 * Test the empty method with Double and String
	 */
	@Test
	public void testEmpty() {

		// Test with Double
		//
		Stack<Double> testDouble = new Stack<Double>(1);
      	assertTrue(testDouble.empty(), "after construction");
      	testDouble.push(10.5);

      
      // Test with String

	}
	
	/**
	 * Test the push method
	 */
	@Test
	public void testPush() {
	}
	
	/**
	 * Test the exception in the push method with Double
	 */
	@Test
	public void testPushDoubleException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Stack<Double> testDouble = new Stack<Double>(1);
			testDouble.push(10.5);
			testDouble.push(11.8);
		});
	}
	
	/**
	 * Test the exception in the push method with String
	 */
	@Test
	public void testPushStringException() {
	}

	/**
	 * Test the pop method
	 */
	@Test
	public void testPop() {
	}
	
	/**
	 * Test the exception in the pop method with Double
	 */
	@Test
	public void testPopDoubleException() {

	}
	
	/**
	 * Test the exception in the pop method with String
	 */
	@Test
	public void testPopStringException() {
	}
	
	/**
	 * Test the peek method
	 */
	@Test
	public void testPeek() {
	}
	
	/**
	 * Test the exception in the peek method with Double
	 */
	@Test
	public void testPeekDoubleException() {
	}
	
	/**
	 * Test the exception in the peek method with String
	 */
	@Test
	public void testPeekStringException() {
	}
	
	/**
	 * Test the copy method
	 */
	@Test
	public void testCopy() {
	}
	
	/**
	 * Test the equals method with Double
	 */
	@Test
	public void testEqualsStackOfT() {
	}
	
	/**
	 * Test the equals method with String
	 */
	@Test
	public void testEqualsStackOfT2() {
	}
	
	/**
	 * Test the toString method
	 */
	@Test
	public void testToString() {
	}
}
