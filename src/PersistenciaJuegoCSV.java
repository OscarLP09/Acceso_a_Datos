import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaJuegoCSV {
    public static void main(String[] args){

        var j = new Juego();
        j.setTitulo("Sonic");
        j.setDesarrollador("Sonic Team");
        j.setAño(1991);
        j.setPlataforma("SEGA");
        j.setGenero("Plataforma");

        try(var bw = new BufferedWriter(new FileWriter("juegos.csv"))){
            bw.write(
                    j.getTitulo()+", " +
                            j.getPlataforma() + ", " +
                        j.getAño() + ", " +
                            j.getGenero() + ", " +
                            j.getDesarrollador()
                    );
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
