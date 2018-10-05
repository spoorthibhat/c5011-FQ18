/*
 * Sheila Oh
 * CPSC 5011, Seattle University
 * This is free and unencumbered software released into the public domain.
 */

package bishopgrant_arrayIntLits;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * This JUnit testing program checks some of the basic features of our 
 * ArrayIntList. You can run it in Eclipse by right-clicking it in the 
 * Package Explorer and choosing Run As -> Junit Test.  
 * Reference: CSE 143, Winter 2011, Marty Stepp                                                               
 * @author ohsh, modified Grant Bishop
 */
public class ArrayIntListTest {
   
   /**
    * Test no-arg constructor, should be non-null empty list
    */
	@Test
	public void testConstructor() {	
	   ArrayIntList list = null;
	   Assert.assertNull(list);
	   list = new ArrayIntList();
	   Assert.assertNotNull(list);
	   Assert.assertTrue(list.isEmpty());
	   Assert.assertEquals(0, list.size());
	}
	
	/**
	 * Test constructor with illegal argument, should throw exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstructor2() {
	   ArrayIntList list = new ArrayIntList(-2);
	}
	
	/**
	 * Test constructor with valid argument - look for non-null empty list
	 */
	@Test
	public void testConstructor3() {
	   ArrayIntList list = null;
      Assert.assertNull(list);
      list = new ArrayIntList(10);
      Assert.assertNotNull(list);
      Assert.assertTrue(list.isEmpty());
      Assert.assertEquals(0, list.size());
	}

	/**
	 * Test add by adding values and confirming with get() and size()
	 * Way to decouple test from get() and size()?
	 */
	@Test
	public void testAddValue() {
		ArrayIntList list = new ArrayIntList();
		list.add(0);
		list.add(1);
		list.add(-1);
		list.add(2);
		Assert.assertTrue(list.contains(0));
		Assert.assertTrue(list.contains(-1));
		Assert.assertTrue(list.contains(2));
		Assert.assertEquals(list.size(), 4);
	}

	@Test
	public void testAddValueAtIndex() {
		fail("Not yet implemented");
	}

    /** ssert.asserr
     * This test makes sure that the list enforces its precondition about                                       
     * the legal indexes passed to the get method.  
     * If an ArrayIndexOutOfBoundsException is NOT thrown, the test fails                                      
     */
	@Test(expected = ArrayIndexOutOfBoundsException.class) 
	public void testGet() {
		ArrayIntList list = new ArrayIntList();                                            
        list.get(17);   // this should crash  
	}

	/**
	 * Test set (change value of existing index)
	 */
	@Test
	public void testSet() {
		ArrayIntList list = new ArrayIntList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
	   list.set(0, -1);
	   list.set(3, -2);
	   Assert.assertEquals(-1, list.get(0));
	   Assert.assertEquals(-2, list.get(3));
	   
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

	/**
	 * Test remove function via confriming that contains is false
	 */
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
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

	/**
	 * Test contains
	 */
	@Test
	public void testContains() {
		ArrayIntList list = new ArrayIntList();
		for(int i = 0; i < 10; i++)
		   list.add(i);
		for(int i = 0; i < 10; i++)
		   Assert.assertTrue(list.contains(i));
	}

}
