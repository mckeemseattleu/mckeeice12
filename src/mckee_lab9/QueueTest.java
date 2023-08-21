/*
 * JungBok Cho
 * CPSC 5002, Seattle University
 * This is free and unencumbered software released into the public domain.
 */
package mckee_lab9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


/**
 * This is a program to test generic queue.
 * 
 * @author  Mike McKee
 * @version 1.0
 */
public class QueueTest {
	/**
	 * Test the empty method with Double and String
	 */
	@Test
	public void testEmpty() {
		// Test with Double
		Queue<Double> testDouble = new Queue<Double>();
      	assertTrue(testDouble.empty(), "after construction");
      // Test with String


	}

	/**
	 * Test the enqueue method
	 */
	@Test
	public void testEnqueue() {
		// Test with Double
		Queue<Double> testDouble = new Queue<Double>();
		assertTrue(testDouble.empty(), "after construction");


	}

	/**
	 * Test the dequeue method
	 */
	@Test
	public void testDequeue() {
		// Test with Double
		Queue<Double> testDouble = new Queue<Double>();
		assertTrue(testDouble.empty(), "after construction");

	}
	
	/**
	 * Test the exception in the enqueue method with Double
	 */
	@Test
	public void testDequeueDoubleException() {
	}
	
	/**
	 * Test the exception in the enqueue method with String
	 */
	@Test
	public void testDequeueStringException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Queue<String> testString = new Queue<String>();
			testString.dequeue();
		});
	}

	/**
	 * Test the peek method
	 */
	@Test
	public void testPeek() {
		// Test with Double
		Queue<Double> testDouble = new Queue<Double>();
		assertTrue(testDouble.empty(), "after construction");
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
		// Test with Double
		
		// Test with String

	}

	/**
	 * Test the append method with Double
	 */
	@Test
	public void testAppend() {

	}
	
	/**
	 * Test the append method with String
	 */
	@Test
	public void testAppend2() {
	}
	
	/**
	 * Test the equals method with Double
	 */
	@Test
	public void testEqualsDouble() {
		Queue<Double> testDouble = new Queue<Double>();

	}
	
	/**
	 * Test the equals method with String
	 */
	@Test
	public void testEqualsString() {

	
	}
	
	/**
	 * Test the toString method
	 */
	@Test
	public void testToString() {
		Queue<Double> testDouble = new Queue<Double>();
      assertEquals("empty", "", testDouble.toString());

	}

}
