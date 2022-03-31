package Proje.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {
    public void logging2Method(){
        Logger logger = LogManager.getLogger();
        logger.warn("Logging2 Başarıyla loglandı");
    }
}
