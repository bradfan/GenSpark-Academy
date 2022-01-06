import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

//hover over Index and right click to generate test file
public class Index {

    public static void main(String[] args) throws IOException {
//        Index index = new Index();
//        index.createTheFile();
//        index.retrieveDisplay();
        File file = new File("C:\\\\GenSpark-Academy\\\\genspark\\\\Hamgman_project_7\\\\src\\\\main\\\\java\\\\hangman_display.text");
        Scanner scanFile = new Scanner(file);
        while(scanFile.hasNextLine()) {
            System.out.println(scanFile.nextLine());
        }

//     Files.write(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"), "Hello".getBytes(StandardCharsets.UTF_8));
//        var a = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"));
//        System.out.println(a);

// end of MAIN bracket
    }
//    methods go here outside of the main in the class
//    public void createTheFile() throws IOException {
//        Charset utf8 = StandardCharsets.UTF_8;
//        List<String> display = Arrays.asList("+---+",
//                "    |",
//                "    |",
//                "    |",
//                "   === ");
//        Files.write(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text"), display,utf8);
//
//    }
//
//    public String retrieveDisplay() throws IOException {
//        var a = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text")).collect(Collectors.toList());
//        ArrayList<String> displayString = new ArrayList<>(a);
//        System.out.println(Files.readAllLines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hamgman_project_7\\src\\main\\java\\hangman_display.text")));
//        return null;
//
//    }



//end of CLASS bracket
}


