import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class bufferReader {

    public static void main(String[] args) {
        String archivo = "archivo.txt";
        String archivo2 = "archivo_copia.txt";

        // Llamada para scrapear una URL
        scrapUrl("https://medac.es");

        // Llamada para copiar archivo
        copiarArchivoTexto(archivo, archivo2);

        // Llamada para leer archivo
        leerArchivo2(archivo2);

        // Llamada para leer un archivo usando Scanner
        leerScanner(archivo);
    }

    // Método para copiar el contenido de un archivo a otro
    private static void copiarArchivoTexto(String archivo, String archivo2) {
        try (BufferedReader bfr = new BufferedReader(new FileReader(archivo));
             BufferedWriter bfw = new BufferedWriter(new FileWriter(archivo2))) {

            String linea;
            while ((linea = bfr.readLine()) != null) {
                bfw.write(linea);
                bfw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer un archivo usando Scanner
    private static void leerScanner(String ruta) {
        try (Scanner sc = new Scanner(new File(ruta))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());  // Leer línea por línea
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para scrapear el contenido de una URL
    private static void scrapUrl(String ruta) {
        try {
            URL url = new URL(ruta);
            try (BufferedReader bfr = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {

                String linea;
                while ((linea = bfr.readLine()) != null) {
                    if (linea.contains("<title>")) {
                        System.out.println(linea); // Aquí puedes hacer lo que quieras con el contenido
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    // Método para leer y contar las líneas de un archivo
    private static void leerArchivo2(String archivo) {
        try (BufferedReader bfr = new BufferedReader(new FileReader(archivo))) {
            String s;
            int contador = 0;
            while ((s = bfr.readLine()) != null) {
                System.out.println(s.toUpperCase());
                contador++;
            }
            System.out.println("El archivo tiene " + contador + " líneas");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
