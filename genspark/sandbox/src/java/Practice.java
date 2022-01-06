import java.nio.file.Files;
import java.nio.file.Paths;

public class Practice {

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setAge(18);
        e.setName("Bill");
        Abstraction a = new Abstraction();
        a.setAge(18);
        a.setName("Bill");
        int years = a.yearsUntil25();
        System.out.println("Age: " + e.getAge());
        System.out.println("Name: " + a.getName());
        System.out.println("How many years until " + e.getName() + " is 25 years old? " + years + " years.");


    }


}
