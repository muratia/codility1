/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitytask1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahmet
 */
public class MultipleIT {
    
    public MultipleIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Multiple.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Multiple instance = new Multiple();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setName method, of class Multiple.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Multiple instance = new Multiple();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getValue method, of class Multiple.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Multiple instance = new Multiple();
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setValue method, of class Multiple.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        Multiple instance = new Multiple();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
