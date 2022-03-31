package Logging2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {
    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        insertPersonel("*********");
    }

    public static void insertPersonel(String name) {
        logger.info(name + " adlı personel başarılı bir şekilde eklendi");
    }
}
