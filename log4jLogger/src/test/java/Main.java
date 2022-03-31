import Proje.Logger.Logging2;
import Proje.Logging1;
import Proje.Logger.Util.Logging3;

public class Main {
    public static void main(String[] args) {
        Logging1 logging1 = new Logging1();
        Logging2 logging2 = new Logging2();
        Logging3 logging3 = new Logging3();

        logging1.logging1Method();
        logging2.logging2Method();
        logging3.logging3Method();
    }
}
