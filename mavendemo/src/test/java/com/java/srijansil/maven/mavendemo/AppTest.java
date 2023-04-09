package com.java.srijansil.maven.mavendemo;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{



	/**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void giveANameWhenHelloThenReturnHelloName()
    {
    	App app = new App();
    	
    	String result =  app.hello("Srijansil");
    	
    	Assert.assertNotNull(result);
    	
    	Assert.assertEquals("Hello Srijansil", result);
    }
}
