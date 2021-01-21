import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.userInteraction.Menu;


public class App {

    private static void setupLogger() {
        logger.log(Level.INFO, "test");
        logger.setLevel(Level.ALL);
        
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        logger.addHandler(ch);
        
        try {
            FileHandler fh = new FileHandler("myLogger.log");
            fh.setLevel(Level.FINE);
            logger.addHandler(fh);
        } catch (IOException e) {   
            logger.log(Level.SEVERE, "Logger not working!", e);
        }
    }

    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
   
    public static void main(String[] args) {

        App.setupLogger();
        logger.info("My test log");
        logger.fine("My second log");

        try {
            throw new java.io.IOException();
        } 
        catch (java.io.IOException e) {
            logger.log(Level.SEVERE, "File read error", e);
        }
        
        Menu menu = new Menu();
        menu.runMenu();
        
    }
}
