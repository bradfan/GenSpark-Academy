import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) throws IOException {
        Index index = new Index();
        File file = new File("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display.text");
        Scanner scanFile = new Scanner(file);
        while(scanFile.hasNextLine()) {
            System.out.println(scanFile.nextLine());
        }
    }
}
