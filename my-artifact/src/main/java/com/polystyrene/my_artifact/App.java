package com.polystyrene.my_artifact;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Log log = LogFactory.getLog(App.class);
        log.info("Hello, world!");
    }
    int sum(int ... ns) {
        int x = 0;
        for (int n : ns) {
            x += n;
        }
        return x;
    }
}
