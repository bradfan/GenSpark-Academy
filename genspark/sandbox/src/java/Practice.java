import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

//    come up with a method that compares two strings that have matching characters but are out of order.
    public static boolean isTheSame(String a, String b) {
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }


    public static void reverseNumber(int n) {
        String temp = String.valueOf(n);
        String reverse = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            reverse += temp.charAt(i);
        }
        int result = Integer.parseInt(reverse);
        System.out.println("Reverse Number: " + result);
    }


    public static void main(String[] args) {
        Practice practice = new Practice();
        String argument = "always in reverse, like the French Army";
        String parentheses = ")(((())))(";


        int answer = (int) Math.floor(9 / 2);
        System.out.println(answer);
        float fAnswer = (float) Math.floor(9 / 2);
        System.out.println(fAnswer);
        int answer2 = (int) Math.ceil(9 / 2);
        System.out.println(answer2);
        float cAnswer = (float) Math.ceil(9 / 2);
        System.out.println(cAnswer);
        System.out.println(2 + (-3) + 5 + (-8));

        char[][] array = {{'S', 'S', 'S'},
                {'S', 'S', 'S'}};

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }

//        int counter = 1;
        for (char[] row : array) {
            System.out.println();
//            System.out.print(counter + " ");
//            counter++;
            for (char c : row) {
                System.out.print(c + " ");
            }
        }
        System.out.println();

        array[0][2] = 'X';
        int counter1 = 1;
        for (char[] row : array) {
            System.out.println();
            System.out.print(counter1 + " ");
            counter1++;
            for (char c : row) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
        reverseNumber(7859);
        System.out.println();
        System.out.println("Jet Brains snippets below: ");

        System.out.println();
        System.out.println(isTheSame("mice", "mcie"));


    }


}


//        System.out.println(practice.method(argument));
//        System.out.println(practice.fizzBuzz(100));
//        Animal dog = new Dog();
//        dog.sound();
//        dog.limbs();
//        Animal spider = new Spider();
//        spider.sound();
//        spider.limbs();
//        var stream = argument.lines();
//        System.out.println("Stream solution: " + practice.solution(stream));
//        System.out.println("Parentheses: " + practice.practice(parentheses));
//        System.out.println("Alternate Parentheses: " + practice.parentheses(parentheses));
//        System.out.println(practice.removeDuplicates());
//        System.out.println(practice.solution("radar"));
////        System.out.println("++i/i++");
////        int b = 3;
////        int c = ++b;
////        System.out.println("C = " + c);
////        int d = ++b;
////        System.out.println("B = " + b + " " + "C = " + c + " " + "D = " + d);
////        int e = ++b;
////        System.out.println("E = " + b);
////        for (long i = 0; i <= 50; i++) {
////            System.out.println(i++);
////        }
//        practice.factorial(12);
////        test.reverseFactorial();
////        test.smallValue();
//        practice.gettingOld();
//
//    }
//}


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

//    Be Careful! Bears shouldn't Ingest Large Furry Dogs
//        Boolean -> Char -> Byte -> Short -> Int -> Long -> Float -> Double

//    code snippet for printing out 2D array - tic tac toe board
//    char [][] board = {{'_', '_', '_', '_', '_'},
//            {'|', ' ', ' ', ' ', '|'},
//            {'|', ' ', ' ', ' ', '|'},
//            {'|', ' ', ' ', ' ', '|'},
//            {'_', '_', '_', '_', '_'}};
//        for (char[] row : board) {
//        for (char c: row) {
//            System.out.print(c);
//        }
//        System.out.println();
//    }

//CODE STORAGE
//public String method(String str) {
//    String reverse = "";
//    for (int i = str.length() - 1; i >= 0; i--) {
//        reverse += str.charAt(i);
//    }
//    return reverse;
//}
//
//    public List<String> fizzBuzz(int n) {
//        List<String> result = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (i % 15 == 0) {
//                result.add("FizzBuzz" + " ");
//            } else if (i % 5 == 0) {
//                result.add("Buzz" + " ");
//            } else if (i % 3 == 0) {
//                result.add("Fizz" + " ");
//            } else result.add(i + " ");
//        }
//        return result;
//    }
//
//public static abstract class Animal {
//    public abstract void sound();
//
//    public abstract Integer limbs();
//
//    int trial = 4;
//}
//
//public static abstract class Mammal extends Animal {
//    //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
//    public void sound() {
//        System.out.println("Noise");
//    }
//
//    //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
//    public Integer limbs() {
//        int mammalLimbs = trial;
//        System.out.println("Limbs: " + mammalLimbs);
//        return mammalLimbs;
//    }
//
//
//}
//
//public static class Dog extends Mammal {
//    //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
//    public void sound() {
//        System.out.println("Dogs Bark");
//    }
//
//}
//
//public static abstract class Insect extends Animal {
//    //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
//    public void sound() {
//        System.out.println("Noise");
//    }
//    //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
//
//}
//
//public static class Spider extends Insect {
//    //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
//    public void sound() {
//        System.out.println("Spiders are inaudible");
//    }
//
//    public Integer limbs() {
//        int spiderLimbs = 8;
//        System.out.println("Limbs: " + spiderLimbs);
//        return spiderLimbs;
//    }
//
//}
//
//    public String solution(Stream word) {
//        // ↓↓↓↓ your code goes here ↓↓↓↓
//        System.out.println("Word: " + word);
//        var example = word.toString();
//        System.out.println("In Method: " + example);
//        String reverse = "";
//        for (int i = example.length() - 1; i >= 0; i--) {
//            reverse += example.charAt(i);
//        }
//
////        return word.reduce("", (a, b) -> b + a, (a1, a2) -> a2 + a1);
//        return reverse;
//    }
////    public String solution(String word) {
////        // ↓↓↓↓ your code goes here ↓↓↓↓
////        if (word.isEmpty()) return word;
////  String reverse = Arrays.asList(word)
////                .stream()
////                .map(str -> new StringBuilder(str)
////                        .reverse()
////                        .toString())
////                .collect(Collectors.toList())
////                .get(0);
////        return reverse;
////    }
//
//
//    public String practice(String s) {
//        Stack<Character> stack = new Stack<>();
//        if (s.isEmpty()) return "unbalanced";
//        for (var c : s.toCharArray()) {
////            must use single quotes ' character ' here and not double quotes " character "
//            if (c == '(') {
//                stack.push(c);
//            } else {
//                if (stack.isEmpty()) {
//                    return "unbalanced";
//                } else stack.pop();
//            }
//        }
//        if (!stack.isEmpty()) {
//            return "unbalanced";
//        }
//        return "balanced";
//    }
//
//    public String parentheses(String string) {
//        if (string.isEmpty()) return "unbalanced";
//        int count = 0;
//        for (var c : string.toCharArray()) {
//            if (c == '(') {
//                count += 1;
//            } else count -= 1;
//        }
//        System.out.println("() count: " + count);
//        if (count == 0) {
//            return "balanced";
//        } else return "unbalanced";
//    }
//
//    public List<Integer> removeDuplicates() {
//        HashSet<Integer> input = new HashSet<>();
//        input.add(4);
//        input.add(1);
//        input.add(1);
//        input.add(4);
//        input.add(3);
//        input.add(2);
//        input.add(-1);
//        List<Integer> result = new ArrayList<>(input);
//        return result;
//    }
//
//
//    public int[] solution(int[] nums) {
//        HashSet<Integer> filter = new HashSet<>();
//        for (int i = 0; i <= nums.length; i++) {
//            filter.add(nums[i]);
//        }
//        int[] result = filter.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//        return result;
//    }
//
//    public boolean solution(String pally) {
//        String reversePally = "";
//        for (int i = pally.length() - 1; i >= 0; i--) {
//            reversePally += pally.charAt(i);
//        }
//        if (pally.equals(reversePally)) {
//            return true;
//        } else return false;
//    }
//
//    public void factorial(int n) {
//        long product = 1L;
//        for (int i = n; i > 0; i--) {
//            product *= i;
//        }
//        System.out.println("Product: " + product);
//    }
//
//    public void reverseFactorial() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number to compute reverse factorial: ");
//        long number = sc.nextLong();
//        double reverse = number;
//        for (int a = 2; reverse != a; a++) {
//            reverse = reverse / a;
//        }
//        System.out.println("Reverse factorial of " + number + " is: " + reverse);
//    }
//
//    public void smallValue() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("****");
//        long input = sc.nextLong();
//        long product = 1L;
//        int result = 0;
//        for (int i = 1; i <= input; i++) {
//            product *= i;
//            if (product > input) {
//                result += i;
//                System.out.println(result);
//                break;
//            }
//        }
//    }
//




