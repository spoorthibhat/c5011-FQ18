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
	public void testConstructor() { //done
		ArrayIntList list = new ArrayIntList();
		assertEquals(0, list.size());
		
	}

	@Test
	public void testAddValue() { //done
		ArrayIntList list = new ArrayIntList();
		list.add(1);
		list.add(5);
		list.add(5);
		assertEquals(3, list.size());
	}

	@Test
	public void testAddValueAtIndex() { //done
		ArrayIntList list = new ArrayIntList();
		list.add(0,10);
		list.add(1,28);
		list.add(2,15);
		list.add(40); //should add at end
		assertEquals(0,list.indexOf(10));
		assertNotEquals(1,list.indexOf(76));
		assertEquals(2,list.indexOf(15));
		assertEquals(list.size()-1,list.indexOf(40));
	}

    /** 
     * This test makes sure that the list enforces its precondition about                                       
     * the legal indexes passed to the get method.  
     * If an ArrayIndexOutOfBoundsException is NOT thrown, the test fails                                      
     */
	@Test (expected = ArrayIndexOutOfBoundsException.class) 
	public void testGet() {
		ArrayIntList list = new ArrayIntList();                                            
        list.get(17);   // this should crash  
	}

	@Test
	public void testSet() { 
		ArrayIntList list = new ArrayIntList();
		list.add(0,29);
		list.add(1,376);
		list.add(30);
		list.add(3,-17);
		assertEquals(2,list.indexOf(30));
		assertNotEquals(4,list.indexOf(-17));
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
        list.remove(0);
        assertEquals(3, list.size()); 
        assertNotEquals(4, list.size());
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
	public void testRemove() { //done
		ArrayIntList list = new ArrayIntList();
		list.add(0,7);
		list.add(1,9);
		list.remove(0);
		assertEquals(9,list.get(0));
		
	}

	@Test
	public void testToString() { // done
		ArrayIntList list = new ArrayIntList();
		list.add(0,3);
		list.add(1,5);
		list.add(2,8);
		assertEquals("[3, 5, 8]",list.toString());
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
        list.add(42);
        assertEquals(0, list.indexOf(42));
        assertEquals(5, list.indexOf(86));
        assertEquals(2, list.indexOf(17));         // not 4!
        assertEquals(-1, list.indexOf(5555555));   // not found in list
	}

	@Test
	public void testContains() {     //
		ArrayIntList list = new ArrayIntList();                               
        list.add(42);                                      
        list.add(-3);                                         
        list.add(17);                                            
        list.add(999);                                     
        list.add(17);                                                   
        list.add(86);
        assertEquals(true, list.contains(999));
        assertEquals(false, list.contains(-692));
        
	}

}
