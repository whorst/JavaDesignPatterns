package BehavioralPatterns.ChainOfResponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    public static void firstExample(){
        Logger logger = Logger.getLogger(LoggingExample.class.getName());
        //level to log at
        logger.setLevel(Level.FINER);

        //set the level to publish at
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); //this one wont print
        logger.finer("Finest level of logging");
        logger.fine("Finest level of logging");
    }
}
