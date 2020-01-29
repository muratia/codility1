/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitytask1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ahmet
 */
public class PersonNGTest {
    
    public PersonNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Person instance = new Person();
        
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Person instance = new Person();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Person instance = new Person();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of getAccount method, of class Person.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getAccount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setAccount method, of class Person.
     */
    @Test
    public void testSetAccount() {
        System.out.println("setAccount");
        String account = "";
        Person instance = new Person();
        instance.setAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Person instance = new Person();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        
    }
 
   
}
