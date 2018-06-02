

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calcu.Calcu;
import calcu.Calcu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inspi
 */
public class calcutest1 {
    
    Calcu c;
    
    
    public calcutest1() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        c = new Calcu();
    }
    
    @After
    public void tearDown() {
    }
    
    

   
    
        /**
     * Method tests add() method of class Calculator.
     */
    @Test
    public void testAddition() {
    
        assertEquals(6.0000,c.add(3.000, 3.000)); 
        
    }
    
    /**
     * Method tests subtract() method of class Calculator.
     */
     @Test
    public void testSubtraction() {
    
        assertEquals(4.0000,c.sub(9.000, 5.000); 
        
    }
    
    /**
     * Method tests multiply() method of class Calculator.
     */
     @Test
    public void testMultiplition() {
    
        assertEquals(1.0000,c.mul(1,1)); 
        
    }
    
    /**
     * Method tests divide() method of class Calculator.
     */
     @Test
    public void testDivision() {
    
        assertEquals(0.0000,c.div(0,1));    
      
        
        try {
        assertEquals(0.0000,c.div(10,0),0.0009);  
        fail();
        }catch(ArithmeticException e) {
            
        }
    }
    // @Test
    // public void hello() {}
}
