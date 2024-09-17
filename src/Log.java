import java.util.logging.Level;
import java.util.logging.Logger;

// Mirar que es el New Data
public class Log {
    private static Logger log = Logger.getLogger(Main.class.getName()); //
    public static void main(String[] args) {

        log.severe("Hello World");
        log.warning("Hello World");
        log.info("Hello World");
        log.log(Level.INFO, "Nuevo dato"); //new Data());


    }
}
