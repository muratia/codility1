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
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Person p = new Person();
    }
    
    @AfterClass
    public static void tearDownClass() {
        Person p = new Person();
        p = null;
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("Testing the getFirstName");
        String firstName = "Ahmet";
        Person instance = new Person(firstName,"","","");
        String expResult = "Ahmet";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("Testing setFirstName");
        String firstName = "Ahmet";
        String expValue = "Ahmet";
        Person instance = new Person();
        instance.setFirstName(firstName);
        assertEquals(expValue, instance.getFirstName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Person instance = new Person("","Murati","","");
        String expResult = "Murati";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Murati";
        Person instance = new Person();
        instance.setLastName(lastName);
        assertEquals(lastName,instance.getLastName());
    }

    /**
     * Test of getAccount method, of class Person.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        Person instance = new Person("","","ahmet.mur","");
        String expResult = "ahmet.mur";
        String result = instance.getAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setAccount method, of class Person.
     */
    @Test
    public void testSetAccount() {
        System.out.println("setAccount");
        String account = "ahmet.mur";
        Person instance = new Person("","","ahmet.mur","");
        instance.setAccount(account);
        assertEquals( account, instance.getAccount());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new Person("","","","ahmet.mur@example.com");
        String expResult = "ahmet.mur@example.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "ahmet.mur@example.com";
        Person instance = new Person();
        instance.setEmail(email);
        
        assertEquals(email, instance.getEmail());
        // TODO review the generated test code and remove the default call to fail.
         
    } 
}
