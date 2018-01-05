package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import commons.MyArrayUtilsEx;

public class MyArrayUtils2Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddIntArrayInt() {
		int [] array = {0, 1};
		array = MyArrayUtilsEx.add(array, 2);
		assertEquals(3, array.length);
		assertEquals(2, array[2]);
	}
}
