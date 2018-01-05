package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import commons.MyArrayUtils;

public class TestRemove {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// removeElement(T[], Object)和remove(T[], int)采用自底向上的方法进行集成
	@Test
	public void testRemoveTArrayInt() {
		int [] array = {0, 1, 2};
		array = MyArrayUtils.removeElement(array, 1);
		assertEquals(2, array.length);
		assertEquals(2, array[1]);
	}

}
