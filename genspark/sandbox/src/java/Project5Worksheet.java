import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;


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

    public static void findNumber(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                System.out.println(array[i] + 1);
                break;
            }
        }
    }

    public static void pseudocode(int[] array) {
        int result = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            result += array[i];
        }
        System.out.println(result / array.length);
    }

    public static String reverseWords(String original) {
        String[] array = original.split(" ");
        if (array.length == 0) {
            return original;
        }
        String strStream = "";
        for (int i = 0; i <= array.length - 1; i++) {
            strStream += Stream.of(array[i].split("")).reduce("", (a, b) -> b + a) + " ";
        }
        return strStream.trim();
    }


    public static String streamReverse(String str) {
        return Stream.of(str.split(""))
                .reduce("", (a, b) -> b + a);
    }

    public static String reverseStringBuilder(String input) {
        StringBuilder result = new StringBuilder();
        return result.append(input)
                .reverse() + "";
    }


    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }

    public static int binToDecimal(String inp) {
        // your code here
        BigInteger binary = new BigInteger(inp);
        int decimal = 0;
        int i = 0;
        while (true) {
            if (binary == BigInteger.valueOf(0)) {
                break;
            } else {
                BigInteger bigTemp = binary.mod(BigInteger.valueOf(10));
                int temp = bigTemp.intValue();
                decimal += temp * Math.pow(2, i);
                binary = binary.divide(BigInteger.valueOf(10));
                i++;
            }
        }
        return decimal;
    }

    public static int binToDecimalSolution(String inp) {
        return Integer.parseInt(inp, 2);
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int total = yourPoints;
        int numberOfScores = classPoints.length + 1;
        for (int x : classPoints) {
            total += x;
        }
        return yourPoints > total / numberOfScores;
    }


    public static String rps(String p1, String p2) {
        // your code sucks
        String s = "scissors";
        String r = "rock";
        String p = "paper";
        String player1 = "Player 1 won!";
        String player2 = "Player 2 won!";

        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals(s) && p2.equals(r)) {
            return player2;
        } else if (p1.equals(r) && p2.equals(s)) {
            return player1;
        } else if (p1.equals(r) && p2.equals(p)) {
            return player2;
        } else if (p1.equals(p) && p2.equals(r)) {
            return player1;
        } else if (p1.equals(p) && p2.equals(s)) {
            return player2;
        } else {
            return player1;
        }

    }

    public static int sameCase (char first, char second) {
        if (Character.isLetter(first) && Character.isLetter(second)) {
            return Character.isUpperCase(first) && Character.isUpperCase(second)
                    || Character.isLowerCase(first) && Character.isLowerCase(second) ? 1 : 0;
        } return -1;
    }


        public static void main (String[]args){
            //    OVERLOADING
            print("some string");
            print("another string", 2);
            print(2, "another string again");
            print(5);
            System.out.println(createEnglishAlphabet());
            System.out.println("JetBrains snippets: ");
            int[] b = {1, 2, 3, 4, 5};
            pseudocode(b);
            System.out.println("CodeWars: " + reverseWords("Code wars sucks"));
            System.out.println(streamReverse("This is a reversed string."));
            System.out.println("String Builder: " + reverseStringBuilder("Java in the morning."));
            int[] a = {4, 3, 9, 7, 2, 1};
            System.out.println("Fun!!: " + Arrays.toString(squareOrSquareRoot(a)));
            System.out.println("Code Wars");
            System.out.println(binToDecimal("1011011111111100101000"));
            System.out.println(binToDecimalSolution("1011011111111100101000"));
            int[] xRay = {89, 57, 93, 65};
            System.out.println(betterThanAverage(xRay, 90));
            System.out.println("Same Case Method: ");
            System.out.println(sameCase('n', 'b'));



        }
    }


//int aValue = (int) first;
//        int bValue = (int) second;
//        int scenario = 0;
//        if (aValue >= 65 && aValue <= 90 && bValue >= 65 && bValue <= 90) {
//            return 1;
//        }
//        if (aValue >= 97 && aValue <= 122 && bValue >= 97 && bValue <= 122) {
//            return 1;
//        }
//
//        return 0;