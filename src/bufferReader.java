import java.io.*;

//
public class bufferReader {

    public static void main(String[] args) {
        String archivo;
        String archivo2;
        private static void copiarArchivoTexto(String archivo, String archivo2){
            try(BufferedReader bfr = new BufferedReader(new FileReader(archivo));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(archivo2));
            )}

        private static void leerArchivo2 (String archivo){
            try (BufferedReader bfr = new BufferedReader(
                    new FileReader(archivo))
            ) {
                Integer lineas = bfr.lines().toList();
                System.out.println(lineas);
            /*String s;
            Integer contador=0;
            while ((s=bfr.readLine())!=null){
                System.out.println(s.toUpperCase());
                contador++;
            };
            System.out.println("El archivo tiene " + contador + " lineas");*/

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
