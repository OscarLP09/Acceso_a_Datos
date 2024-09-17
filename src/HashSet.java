import java.util.HashMap;

public class HashSet {
    public static void main(String[] args){
        System.out.println("Hello World");

        var mapa = new HashMap<String, Integer>();
        mapa.put("a", 1);
        mapa.put("b", 2);
        mapa.put("c", 3);
        mapa.put("d", 1);

        mapa.forEach((x,v)-> System.out.println("[ " + x + " ] -> " + v));

        System.out.println(mapa.values());
        System.out.println(mapa.keySet());

    }
}
