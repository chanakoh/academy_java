package com.kh.testSample;
import static org.junit.Assert.*;// Assert.������ ��� ��ȯ
import org.junit.Test;
public class CalculatorTest {
	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(50000000, 200);
		assertEquals(600,result);//���󰪰� ���� ����� ��
	}
	@Test
	public void testSubstraction() {
		Calculator cal = new Calculator();
		int result = cal.substract(10, 5);
		assertEquals(5,result);
	}
		
	}
