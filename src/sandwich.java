import lombok.Data;
import java.io.Serializable;
public class sandwich {
    //Lombok
    @Data
    public class Sandwich implements Serializable {
        private String name;
        private Integer precio;
        private Double grosor;

    }
}
