import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

//hover over Index and right click to generate test file
public class Index {

    public static void main(String[] args) throws IOException {


     Files.write(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"), "Hello".getBytes(StandardCharsets.UTF_8));
        var a = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"));
        System.out.println(a);


    }
//    methods go here outside of the main in the class





}


