package com.polystyrene.my_artifact;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testApp()
    {
        Greeting.main(null);
        assertEquals(6, new Greeting().sum(1, 2, 3) );
    }
}
