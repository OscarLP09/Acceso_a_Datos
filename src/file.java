import java.io.File;
public class file {


    public static void main(String[] args){
        File f = new File("hola.txt");
        for (File s : f.listFiles()){
            System.out.println(
                    s.getName() + " " + s.isDirectory() + " "
                            + s.isFile() + " " + s.length()
            );
        }
            /*
            try{
                System.out.println(f.exists());
            }
            */
    }
}
