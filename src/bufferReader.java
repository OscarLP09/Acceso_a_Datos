import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {
    public static void main(String[] args){
        try(BufferedReader bfr = new BufferedReader(
                new FileReader("input.txt"))
        ){

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
