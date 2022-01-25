import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {


    public static void main(String[] args) throws IOException {
        Files.write(Paths.get("file_name.txt"), "NAME email age gender destination \n".getBytes(StandardCharsets.UTF_8));
        var brainFart = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\sandbox\\practice_name.txt")).filter(i -> i.contains("Phone")) .collect(Collectors.toList());
        System.out.println(brainFart);
        Files.write(Paths.get("what_we_want.txt"), brainFart);



//        myList.add("boarding_pass.txt");
//        myList.add("Goodbye");
//        myList.add("Don't call me.");






    }


}


//    public static void main(String[] args) {
//        Encapsulation e = new Encapsulation();
//        e.setAge(18);
//        e.setName("Bill");
//        Abstraction a = new Abstraction();
//        a.setAge(18);
//        a.setName("Bill");
//        int years = a.yearsUntil25();
//        System.out.println("Age: " + e.getAge());
//        System.out.println("Name: " + a.getName());
//        System.out.println("How many years until " + e.getName() + " is 25 years old? " + years + " years.");