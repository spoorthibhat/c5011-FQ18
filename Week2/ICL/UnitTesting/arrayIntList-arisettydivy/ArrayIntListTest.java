/*
 * Sheila Oh
 * CPSC 5011, Seattle University
 * This is free and unencumbered software released into the public domain.
 */

package arrayIntList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This JUnit testing program checks some of the basic features of our
 * ArrayIntList. You can run it in Eclipse by right-clicking it in the Package
 * Explorer and choosing Run As -> Junit Test. Reference: CSE 143, Winter 2011,
 * Marty Stepp
 * 
 * @author ohsh
 */
public class ArrayIntListTest {

	@Test
	public void testConstructor() {
		ArrayIntList arrInt = new ArrayIntList();
		assertEquals(0, arrInt.size());

	}

	@Test
	public void testAddValue() {
		ArrayIntList arrIntList = new ArrayIntList();
		arrIntList.add(5);
		assertEquals(1, arrIntList.size());
		arrIntList.add(6);
		assertEquals(2, arrIntList.size());

	}

	@Test
	public void testAddValueAtIndex() {

		ArrayIntList arrayIntList = new ArrayIntList();
		arrayIntList.add(0, 1);
		arrayIntList.add(1, 2);
		assertEquals(2, arrayIntList.size());
		arrayIntList.remove(1);
		assertEquals(1, arrayIntList.size());
	}

	/**
	 * This test makes sure that the list enforces its precondition about the
	 * legal indexes passed to the get method. If an
	 * ArrayIndexOutOfBoundsException is NOT thrown, the test fails
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGet() {
		ArrayIntList list = new ArrayIntList();
		list.get(17); // this should crash
	}

	@Test
	public void testSet() {
		ArrayIntList list = new ArrayIntList();
		list.add(7);
		list.add(1, 4);
		list.set(1, 11);
		assertEquals(11, list.get(1));

	}

	/**
	 * Checks the basic functionality of the size method after adding a few
	 * elements.
	 */
	@Test
	public void testSize() {
		ArrayIntList list = new ArrayIntList();
		assertEquals(0, list.size());
		list.add(42);
		assertFalse(list.isEmpty());
		list.add(-3);
		list.add(17);
		assertEquals(3, list.size());
		list.add(999);
		assertEquals(4, list.size());

	}

	/**
	 * Checks the basic functionality of the isEmpty method after adding and
	 * removing.
	 */
	@Test
	public void testIsEmpty() {
		ArrayIntList list = new ArrayIntList();
		assertTrue(list.isEmpty());

		list.add(42);
		assertFalse(list.isEmpty());
		list.add(-3);
		assertFalse(list.isEmpty());

		list.remove(1);
		list.remove(0);
		assertTrue(list.isEmpty());
	}

	@Test
	public void testRemove() {
		ArrayIntList list = new ArrayIntList();
		list.add(42);
		list.add(-3);
		list.add(17);
		assertEquals(3, list.size());
		list.remove(0);
		assertEquals(2, list.size());

	}

	@Test
	public void testToString() {
		ArrayIntList list = new ArrayIntList();
		list.add(42);
		list.add(-3);
		list.add(17);
		assertEquals("[42, -3, 17]", list.toString());
	}

	/**
	 * Checks the basic functionality of the indexOf method after adding a few
	 * elements.
	 */
	@Test
	public void testIndexOf() {
		ArrayIntList list = new ArrayIntList();
		list.add(42);
		list.add(-3);
		list.add(17);
		list.add(999);
		list.add(17);
		list.add(86);
		assertEquals(0, list.indexOf(42));
		assertEquals(5, list.indexOf(86));
		assertEquals(2, list.indexOf(17)); // not 4!
		assertEquals(-1, list.indexOf(5555555)); // not found in list
	}

	@Test
	public void testContains() {
		ArrayIntList list = new ArrayIntList();
		list.add(42);
		list.add(-3);
		list.add(17);
		assertEquals(false, list.contains(-40));
		assertTrue(list.contains(-3));
	}

}
