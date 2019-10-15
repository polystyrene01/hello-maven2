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
        App.main(null);
        assertEquals(6, new App().sum(1, 2, 3) );
    }
}
