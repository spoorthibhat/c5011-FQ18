/*
 * Sheila Oh
 * CPSC 5011, Seattle University
 * This is free and unencumbered software released into the public domain.
 */

package arrayIntList;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This JUnit testing program checks some of the basic features of our 
 * ArrayIntList. You can run it in Eclipse by right-clicking it in the 
 * Package Explorer and choosing Run As -> Junit Test.  
 * Reference: CSE 143, Winter 2011, Marty Stepp                                                               
 * @author ohsh
 */
public class ArrayIntListTest {

	@Test
	public void testConstructor() {
		ArrayIntList list = new ArrayIntList();
		ArrayIntList list2 = new ArrayIntList(2);
	}

	@Test
	public void testAddValue() {
		ArrayIntList list = new ArrayIntList();
		list.add(17);
		assertEquals(17, list.get(0));
	}

	@Test
	public void testAddValueAtIndex() {
		ArrayIntList list = new ArrayIntList();
		list.add(0, 17);
		assertEquals(17, list.get(0));
	}

    /** 
     * This test makes sure that the list enforces its precondition about                                       
     * the legal indexes passed to the get method.  
     * If an ArrayIndexOutOfBoundsException is NOT thrown, the test fails                                      
     */
	@Test(expected = ArrayIndexOutOfBoundsException.class) 
	public void testGet() {
		ArrayIntList list = new ArrayIntList();                                            
        list.get(17);   // this should crash  
	}

	@Test
	public void testSet() {
		ArrayIntList list = new ArrayIntList();
		list.add(17);
		list.set(0, 18);
		assertNotEquals(17, list.get(0));
	}

	/**
	 * Checks the basic functionality of the size method after adding 
	 * a few elements.
	 */
	@Test
	public void testSize() {
        ArrayIntList list = new ArrayIntList();                                                      
        list.add(42);                                     
        list.add(-3);                               
        list.add(17);                                                         
        list.add(999);                                               
        assertEquals(4, list.size()); 
	}

    /**
     * Checks the basic functionality of the isEmpty method after adding 
     * and removing.                                                  
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
		list.add(17);
		list.remove(0);
		assertTrue(list.isEmpty());
	}

	@Test
	public void testToString() {
		ArrayIntList list = new ArrayIntList();
		assertEquals("[]", list.toString());
		
		list.add(17);
		list.add(20);
		assertEquals("[17, 20]", list.toString());
	}

	/** 
	 * Checks the basic functionality of the indexOf method after adding 
	 * a few elements.
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
        assertEquals(2, list.indexOf(17));         // not 4!
        assertEquals(-1, list.indexOf(5555555));   // not found in list
	}

	@Test
	public void testContains() {
		ArrayIntList list = new ArrayIntList();                                            
        assertFalse(list.contains(17));                                               
                                               
        list.add(42);                                           
        assertTrue(list.contains(42));                                         
	}

}
