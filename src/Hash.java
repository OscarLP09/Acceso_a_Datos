import java.util.HashMap;

public class Hash {  // Definir la clase con el mismo nombre que HashMap crea un conflicto, se debería cambiar el nombre de la clase.

    public static void main(String[] args) {
        // Imprime "Hello World" en la consola.
        System.out.println("Hello World");

        // Crea una instancia de HashMap que asocia cadenas (String) a enteros (Integer).
        // La clave será de tipo String y el valor será de tipo Integer.
        var mapa = new HashMap<String, Integer>();

        // Agrega pares clave-valor al HashMap.
        mapa.put("a", 1);  // Clave: "a", Valor: 1
        mapa.put("b", 2);  // Clave: "b", Valor: 2
        mapa.put("c", 3);  // Clave: "c", Valor: 3
        mapa.put("d", 1);  // Clave: "d", Valor: 1

        // Recorre cada entrada del HashMap e imprime la clave y su valor.
        // La función lambda (x, v) toma la clave (x) y el valor (v) y los imprime en el formato "[clave] -> valor".
        mapa.forEach((x, v) -> System.out.println("[" + x + "] -> " + v));

        // Imprime todos los valores del HashMap como una colección.
        System.out.println(mapa.values());

        // Imprime todas las claves del HashMap como un conjunto.
        System.out.println(mapa.keySet());

        // Intenta obtener el valor asociado con la clave "ddd".
        // Como "ddd" no está en el HashMap, devolverá `null` y lo imprimirá.
        System.out.println(mapa.get("ddd"));

    }
}