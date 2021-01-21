package main.logging;

import java.util.logging.*;


public class Logging {
    Logger logger = Logger.getLogger(Logging.class.getName());
    Logger parent_logger = Logger.getLogger("");
    ConsoleHandler consoleHandler = new ConsoleHandler();
    Logger.addHandler(consoleHandler);

    logger.info("logger handlers: " + Integer.toString(logger.getHandlers().length));
    logger.info("parent_logger handlers: " + Integer.toString(logger.getHandlers().length));
    Handler defaultConsoleHandler = parent_logger.getHandlers()[0];
    logger.info("Default handler level: " + defaultConsoleHandler.getLevel().toString());
}
