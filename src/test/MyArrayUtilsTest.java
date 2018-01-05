package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import commons.MyArrayUtils;

public class MyArrayUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddIntArrayInt() {
		int [] array = {0, 1};
		array = MyArrayUtils.add(array, 2);
		assertEquals(3, array.length);
		assertEquals(2, array[2]);
	}

	@Test
	public void testRemoveElementTArrayObject() {
		int [] array = {0, 1, 2};
		Integer i1 = new Integer(1);
		array = MyArrayUtils.removeElement(array, i1);
		assertEquals(2, array.length);
		assertEquals(2, array[1]);
	}

	@Test
	public void testInsertIntIntArrayIntArray() {
		int [] array = {0, 1, 2};
		array = MyArrayUtils.insert(1, array, 3);
		assertEquals(4, array.length);
		assertEquals(3, array[1]);
		assertEquals(2, array[3]);
	}

}
