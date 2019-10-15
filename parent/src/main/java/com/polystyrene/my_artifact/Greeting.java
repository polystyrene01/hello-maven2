package com.polystyrene.my_artifact;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Greeting 
{
    public static void print( String name )
    {
        System.out.println( "Hello World!" );
        Log log = LogFactory.getLog(Greeting.class);
        log.info("Hello " + name + "!");
    }
    int sum(int ... ns) {
        int x = 0;
        for (int n : ns) {
            x += n;
        }
        return x;
    }
}
