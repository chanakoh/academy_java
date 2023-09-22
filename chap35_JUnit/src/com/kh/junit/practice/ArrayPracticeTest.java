package com.kh.junit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp = new ArrayPractice(3);
	
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] acture = {1,2,3,4,5,6,7,8,9,10};
		assertEquals(expected,acture); // 두 배열은 같은 값을 가지고있으나 변수값 자체는 주소값이므로 일치하지 않음
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
		assertArrayEquals(expected,arrp.getArray());//배열용 비교메서드
	}
	

}
