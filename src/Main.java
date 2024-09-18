import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Imprime "Hello world!" en la consola
        System.out.println("Hello world!");


        // Bloque de código comentado que utiliza ArrayList con objetos Data

        // Crea una nueva lista de ArrayList que almacenará objetos de tipo Data
        ArrayList<Data> listado = new ArrayList();

        // Agrega cuatro nuevos objetos Data a la lista
        /*
        listado.add(new Data());
        listado.add(new Data());
        listado.add(new Data());
        listado.add(new Data());

        // Imprime el contenido de la lista en la consola
        System.out.println(listado);

        // Duplica el contenido de la lista añadiendo todos los elementos actuales nuevamente
        listado.addAll(listado);

        // Imprime el primer elemento de la lista
        System.out.println(listado.get(0));

        // Agrega un nuevo objeto Data a la lista
        listado.add(new Data());

        // Asigna el nombre "Francisco Romero" al campo 'name' del segundo objeto en la lista
        listado.get(1).name = "Francisco Romero";

        // Intenta eliminar un elemento de la lista y lo imprime (Nota: remove() sin parámetros causará un error)
        System.out.println(listado.remove());
        */

        // Crea un nuevo conjunto HashSet que almacenará objetos de tipo Integer
        var conjunto = new HashSet<Integer>();

        // Agrega varios números enteros al conjunto
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(10);
        conjunto.add(22);

        // Imprime el contenido del conjunto en la consola
        System.out.println(conjunto);

        // Recorre cada elemento del conjunto y, si el número es mayor que 9, lo imprime
        conjunto.forEach(
                (i) -> {
                    if (i > 9) {
                        System.out.println(i);
                    }
                }
        );


        // Bloque de código comentado que utiliza un bucle for mejorado y un iterador

        // Recorre cada elemento del conjunto utilizando un bucle for mejorado
        for (Integer i : conjunto) {
            System.out.println(1); // Imprime el número 1 en cada iteración (posiblemente un error, quizás quiso imprimir 'i')

            // Crea un iterador para el conjunto para recorrerlo elemento por elemento
            var it = conjunto.iterator(); // Ayuda a iterar

            // Mientras haya más elementos en el conjunto, imprime el siguiente elemento
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

    }
}