import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class principal2 {
    public static void main(String[] args){

        Properties props = new Properties();
        try{
            props.loadFromXML(new FileInputStream("props.cfg"));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(props);
        System.out.println(System.getenv());
    }
}
