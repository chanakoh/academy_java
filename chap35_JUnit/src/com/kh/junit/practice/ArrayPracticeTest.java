package com.kh.junit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp = new ArrayPractice(3);
	
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] acture = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected,acture);
}
	@Test
	public void testPracitce2() {
		int[] expected = {1,2,3};
		int[] acture = {3,2,1};
		assertNotEquals(expected,acture);
		}
	
	@Test
	public void testPractice3() {
		int[] expected = {1,2,3};
		assertEquals(expected,arrp.getArray());
	}
	

}
