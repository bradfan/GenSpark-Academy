import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project5Worksheet {

//    OVERLOADING
//    Method overloading allows you to implement two or more methods with the same name, but different arguments.
//    The arguments of such methods may differ in their number or type. This helps to avoid having various method references for similar tasks.
//    When invoked, the proper method is chosen based on the provided arguments.
//    If the argument has a different type from what is expected, the closest type of the argument in order of the implicit casting is used.

//    CASTING
//    Be Careful! Bears shouldn't Ingest Large Furry Dogs
//    Boolean -> Char -> Byte -> Short -> Int -> Long -> Float -> Double

//    ACCESS MODIFIERS
//    private: available only for the class itself;
//    default: available for classes from the same package (= package-private);
//    protected: available for classes from the same package and the extending classes.
//    public: available from everywhere;
//    "If you're not sure whether the method is useful for other classes, it’s better to first make it private and expand its availability later if needed."

//    An interface can contain:
//
//    public constants;
//    abstract methods without an implementation (the keyword abstract is not required here);
//    default methods with implementation (the keyword default is required);
//    static methods with implementation (the keyword static is required);
//    private methods with implementation.

//    Comparing wrappers
//    Just like for any reference type, the operator == checks whether two wrapper objects are actually equal,
//    i.e. if they refer to the same object in memory.
//    The method equals , on the other hand, checks whether two wrapper objects are meaningfully equal,
//            for example, it checks if two wrappers or strings have the same value.

    public static void print(String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void print(String stringToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int times, String stringToPrint) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int val) {
        System.out.println(val);
    }


    public static StringBuilder createEnglishAlphabet() {
        StringBuilder alphabet = new StringBuilder();
        for (int i = 65; i < 91; i++) {
            alphabet.append(Character.toString(i) + " ");
        }
        return alphabet.deleteCharAt(51);
    }


    public static void main(String[] args) {
        //    OVERLOADING
        print("some string");
        print("another string", 2);
        print(2, "another string again");
        print(5);
        System.out.println(createEnglishAlphabet());
        System.out.println("JetBrains snippets: ");
        int[] a = {3, 5, 2, 1};
        String ass = """
                "Over hill, over dale,
                Thorough bush, thorough brier,
                Over park, over pale,
                Thorough flood, thorough fire!"\s
                """;
        System.out.println(ass);

        String textBlock = """
                   Hello world
                       Goodbye world""";


        String reply = "The world did not reply, but one of its oceans waved.";

        System.out.println(textBlock + reply);




    }
}


