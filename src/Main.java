import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /* Mirar esto
        ArrayList<Data> listado = new ArrayList();

        listado.add(new Data());
        listado.add(new Data());
        listado.add(new Data());
        listado.add(new Data());

        System.out.println(listado);

        listado.addAll(listado);

        System.out.println(listado.get(0));

        listado.add(new Data());

        listado.get(1).name = "Francisco Romero";

        System.out.println(listado.remove());
        */

        var conjunto = new HashSet<Integer>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(10);
        conjunto.add(22);

        System.out.println(conjunto);

        conjunto.forEach(
                (i)->{
                    if(i > 9) {
                        System.out.println(i);
                    }
                }
        );

        /*for(Integer i : conjunto){
            System.out.println(1);

            var it = conjunto.iterator();// ayuda a iterar
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }  */
    }
}