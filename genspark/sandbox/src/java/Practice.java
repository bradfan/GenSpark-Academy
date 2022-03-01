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

//import java.util.Scanner;
//
//public class SimpleBot {
//        final static Scanner scanner = new Scanner(System.in); // Do not change this line
//
//        public static void main(String[] args) {
//            greet("Guru", "2022"); // change it as you need
//            remindName();
//            guessAge();
//            count();
//            test();
//            end();
//        }
//
//        static void greet(String assistantName, String birthYear) {
//            System.out.println("Hello! My name is " + assistantName + ".");
//            System.out.println("I was created in " + birthYear + ".");
//            System.out.println("Please, remind me of your name.");
//        }
//
//        static void remindName() {
//            String name = scanner.nextLine();
//            System.out.println("What a great name you have, " + name + "!");
//        }
//
//        static void guessAge() {
//        System.out.println("Let me guess your age.");
//        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
//        int rem3 = scanner.nextInt();
//        int rem5 = scanner.nextInt();
//        int rem7 = scanner.nextInt();
//        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
//        System.out.println("Your age is " + age + "; that's a good time to start programming!");
//    }
//
//    static void count() {
//        System.out.println("Now I will prove to you that I can count to any number you want. Please enter a number!");
//        int num = scanner.nextInt();
//        for (int i = 0; i <= num; i++) {
//            System.out.printf("%d!\n", i);
//        }
//    }
//
//    static void test() {
//        System.out.println("Let's test your programming knowledge.");
//        // write your code here
//        boolean correctAnswer = false;
//        while (!correctAnswer) {
//            System.out.println("Java is... \n" +
//                    "1. A good cup of coffee. \n" +
//                    "2. A statically typed programming language. \n" +
//                    "3. A dynamically typed software platform \n" +
//                    "4. A huge pain in the ass. \n" +
//                    "Please type in your answer - 1, 2, 3 or 4");
//            int answer = scanner.nextInt();
//            if (answer == 2) {
//                correctAnswer = true;
//                // System.out.println("Awesome");
//            } else {
//                System.out.println("Please try again!");
//            }
//
//        }
//
//    }
//
//    static void end() {
//        System.out.println("Congratulations, have a nice day!"); // Do not change this text
//    }
//}