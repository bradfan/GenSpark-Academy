import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

//hover over Index and right click to generate test file
public class Index {

    public static void main(String[] args) throws IOException {

     var a = Files.lines(Paths.get("hangman_display.text"));
     Files.write(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"), Collections.singleton("Hello"));










    }
//    methods go here outside of the main in the class





}


