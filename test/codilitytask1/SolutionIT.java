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
public class SolutionIT {
    
    public SolutionIT() {
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
     * Test of solution method, of class Solution.
     */
    @Test
    public void testSolution() {
        System.out.println("solution");
        String names = "Ahmet Murati; Ahmet Naman Murati; Prarim Hoxha; Prarim Artan Hoxha; Ahmet Sadik Murati; Ahmet Hoxha-Murati";
        String domain = "example";
        Solution instance = new Solution();
        String expResult = "Ahmet Murati <ahmet.mur@example.com>; Ahmet Murati <ahmet.mur1@example.com>; Prarim Hoxha <prarim.hox@example.com>; Prarim Hoxha <prarim.hox1@example.com>; Ahmet Murati <ahmet.mur2@example.com>; Ahmet Murati <ahmet.mur3@example.com>; ";
        String result = instance.solution(names, domain);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
