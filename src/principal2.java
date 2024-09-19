import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class principal2 {
    public static void main(String[] args){

        Properties props = new Properties();
        try{
            props.load(new FileReader("props.cfg"));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(props);
    }
}
