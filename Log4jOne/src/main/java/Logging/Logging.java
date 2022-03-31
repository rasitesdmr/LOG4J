package Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    public static void main(String[] args) {

        Logger logger = LogManager.getLogger();
        logger.trace("Trace Log");
        logger.debug("Debug Log");
        logger.info("Info Log");
        logger.warn("Warn Log");
        logger.error("Error Log");
        logger.fatal("Fatal Log");
    }
}
