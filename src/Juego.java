import lombok.Data;
import java.io.Serializable;

@Data

public class Juego {
    private String Titulo;
    private String Desarrollador;
    private int Año;
    private String Plataforma;
    private String Genero;

    public String toCSV(){
        return Titulo + ", " + Desarrollador + ", " + Año + ", " + Plataforma + ", " + Genero;
    }
}
