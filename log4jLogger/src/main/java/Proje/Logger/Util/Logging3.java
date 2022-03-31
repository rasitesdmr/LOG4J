package Proje.Logger.Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging3 {
    public void logging3Method(){
        Logger logger = LogManager.getLogger();
        logger.fatal("Logging3 Başarıyla loglandı");
    }
}
