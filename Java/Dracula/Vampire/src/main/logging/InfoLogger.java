package main.logging;

import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

public class InfoLogger {
    
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    
    public void makeLog() {
        
        try {
        FileHandler fh = new FileHandler("myLog.log");
        logger.addHandler(fh);
        logger.setLevel(Level.INFO);
        

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        int n = 1;
        
        while (n <= 1) {
            logger.info("Adding lines: " + n);
            Thread.sleep(1000);
            n++;
        }
    } catch (SecurityException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (InterruptedException e) {
        e.printStackTrace();
    } 
    }
}

