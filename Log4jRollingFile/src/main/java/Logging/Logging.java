package Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();

        for (int i = 0; i <100 ; i++) {
            logger.info( i +": Deneme");

        }
    }
}
