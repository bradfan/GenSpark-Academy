import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//hover over Index and right click to generate test file
public class Index {

    public static void main(String[] args) throws IOException {
        Index index = new Index();
        index.createTheFile();
        index.retrieveDisplay();

//     Files.write(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"), "Hello".getBytes(StandardCharsets.UTF_8));
//        var a = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"));
//        System.out.println(a);


    }
//    methods go here outside of the main in the class
    public void createTheFile() throws IOException {
        Charset utf8 = StandardCharsets.UTF_8;
        List<String> display = Arrays.asList("+---+\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "   === ");
        Files.write(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"), display,utf8);


    }
    public ArrayList<String> retrieveDisplay() throws IOException {
        var a = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text")).collect(Collectors.toList());
        ArrayList<String> displayString = new ArrayList<>(a);
        return null;

    }




}


