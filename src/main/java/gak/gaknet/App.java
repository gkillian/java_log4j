package gak.gaknet;

import org.apache.log4j.Logger;

/**
 * Apache log4j version 1.x
 *
 */
public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        log.debug("debug message");
        log.info("info message");
    }
}
