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

    public void method() {
        System.out.println("Hello");
    }



    public static void main(String[] args) {

        Practice practice = new Practice();
        practice.method();
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