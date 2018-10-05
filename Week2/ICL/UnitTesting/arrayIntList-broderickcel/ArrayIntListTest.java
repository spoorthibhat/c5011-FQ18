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
	   assertTrue(list.isEmpty());
	   ArrayIntList list2 = null;
	   assertNull(list2);
	   list2 = new ArrayIntList();
	   assertNotNull(list2);
	   assertTrue(list2.isEmpty());
	   assertEquals(0, list2.size());
	}

	@Test
	public void testAddValue() {
      ArrayIntList list = new ArrayIntList();
      list.add(900);
      assertEquals(900, list.get(0));
      assertFalse(list.isEmpty());
      assertTrue(list.contains(900));
      assertFalse(list.contains(10));
      list.add(0);
      assertTrue(list.contains(0));
      list.add(-100);
      assertTrue(list.contains(-100));
      list.add(50);
      assertTrue(list.contains(50)); 
	}

	@Test
	public void testAddValueAtIndex() {
      ArrayIntList list = new ArrayIntList();
      list.add(0, 900);
      assertEquals(900, list.get(0));
      assertFalse(list.isEmpty());
      assertTrue(list.contains(900));
      assertFalse(list.contains(10));
      list.add(0, 0);
      assertEquals(0, list.get(0));
      list.add(0, -100);
      assertEquals(-100, list.get(0));
      list.add(1, 50);
      assertEquals(50, list.get(1));
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
      list.add(42);                                      
      list.add(-3);                                         
      list.add(17);                                            
      list.add(999);                                     
      list.add(17);                                                   
      list.add(86);
      list.set(0, 3);
      assertEquals(3, list.get(0));
      list.set(1, -100);
      assertEquals(-100, list.get(1));
      list.set(4, -800);
      assertEquals(-800, list.get(4));
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
	   list.add(10);
	   list.remove(0);
	   assertTrue(list.isEmpty());
	   list.add(-40);
	   list.add(90);
	   list.remove(1);
	   assertFalse(list.isEmpty());
	   assertFalse(list.contains(90));
	   assertEquals(-40, list.get(0));
	   list.remove(0);
	   assertTrue(list.isEmpty());
	   
	}

	@Test
	public void testToString() {
	   ArrayIntList list = new ArrayIntList(); 
	   assertEquals("[]", list.toString());
      list.add(4);
      assertEquals("[4]", list.toString());
      list.add(-10);  
      assertEquals("[4, -10]", list.toString());
      list.add(17);  
      assertEquals("[4, -10, 17]", list.toString());
      list.add(1000);  
      assertEquals("[4, -10, 17, 1000]", list.toString());
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
      list.add(42);                                      
      list.add(-3);                                         
      list.add(17);                                            
      list.add(999);                                     
      assertTrue(list.contains(42));
      assertTrue(list.contains(-3));
      assertTrue(list.contains(17));
      assertTrue(list.contains(999));
      assertFalse(list.contains(-8));
      assertFalse(list.contains(20));
      assertFalse(list.contains(1000));
	}

}
