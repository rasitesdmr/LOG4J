package Proje;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging1 {
    public void logging1Method(){
        Logger logger = LogManager.getLogger();
        logger.info("Logging1 Başarıyla loglandı");
    }
}
