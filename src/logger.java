import java.util.logging.Level;
import java.util.logging.Logger;

// Mirar que es el New Data
public class logger {
    public static class Data {
        private String info;

        public Data() {
            this.info = info;
        }

        @Override
        public String toString() {
            return "Data: " + info;
        }
    }


    // Se define un objeto estático "log" de tipo Logger, que se utiliza para registrar mensajes.
    // Se asocia al nombre de la clase Main (parece que debería ser la clase Logger, pero el nombre Main está mal).
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        // Registra un mensaje en el nivel SEVERE (gravedad alta).
        log.severe("Hello World");

        // Registra un mensaje en el nivel WARNING (advertencia).
        log.warning("Hello World");

        // Registra un mensaje en el nivel INFO (informativo).
        log.info("Hello World");

        // Registra un mensaje en el nivel INFO con un objeto Data, aunque no hace nada útil con el Data.
        // "new Data()" crea un nuevo objeto Data, pero no es claro su propósito aquí.
        log.log(Level.INFO, "Nuevo dato", new Data());



    }
}