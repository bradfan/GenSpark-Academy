import java.util.*;
import java.util.stream.Stream;

public class TestApp {
    //set up for a mock interview
    public String method(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz" + " ");
            } else if (i % 5 == 0) {
                result.add("Buzz" + " ");
            } else if (i % 3 == 0) {
                result.add("Fizz" + " ");
            } else result.add(i + " ");
        }
        return result;
    }

    public static abstract class Animal {
        public abstract void sound();

        public abstract Integer limbs();

        int trial = 4;
    }

    public static abstract class Mammal extends Animal {
        //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
        public void sound() {
            System.out.println("Noise");
        }

        //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
        public Integer limbs() {
            int mammalLimbs = trial;
            System.out.println("Limbs: " + mammalLimbs);
            return mammalLimbs;
        }


    }

    public static class Dog extends Mammal {
        //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
        public void sound() {
            System.out.println("Dogs Bark");
        }

    }

    public static abstract class Insect extends Animal {
        //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
        public void sound() {
            System.out.println("Noise");
        }
        //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation

    }

    public static class Spider extends Insect {
        //        @Override  this is METHOD OVERRIDE but it's not necessary to add the @Override annotation
        public void sound() {
            System.out.println("Spiders are inaudible");
        }

        public Integer limbs() {
            int spiderLimbs = 8;
            System.out.println("Limbs: " + spiderLimbs);
            return spiderLimbs;
        }

    }

    public String solution(Stream word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        System.out.println("Word: " + word);
        var example = word.toString();
        System.out.println("In Method: " + example);
        String reverse = "";
        for (int i = example.length() - 1; i >= 0; i--) {
            reverse += example.charAt(i);
        }

//        return word.reduce("", (a, b) -> b + a, (a1, a2) -> a2 + a1);
        return reverse;
    }
//    public String solution(String word) {
//        // ↓↓↓↓ your code goes here ↓↓↓↓
//        if (word.isEmpty()) return word;
//  String reverse = Arrays.asList(word)
//                .stream()
//                .map(str -> new StringBuilder(str)
//                        .reverse()
//                        .toString())
//                .collect(Collectors.toList())
//                .get(0);
//        return reverse;
//    }


    public String practice(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.isEmpty()) return "unbalanced";
        for (var c : s.toCharArray()) {
//            must use single quotes ' character ' here and not double quotes " character "
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "unbalanced";
                } else stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return "unbalanced";
        }
        return "balanced";
    }

    public String parentheses(String string) {
        if (string.isEmpty()) return "unbalanced";
        int count = 0;
        for (var c : string.toCharArray()) {
            if (c == '(') {
                count += 1;
            } else count -= 1;
        }
        System.out.println("() count: " + count);
        if (count == 0) {
            return "balanced";
        } else return "unbalanced";
    }

    public List<Integer> removeDuplicates() {
        HashSet<Integer> input = new HashSet<>();
        input.add(4);
        input.add(1);
        input.add(1);
        input.add(4);
        input.add(3);
        input.add(2);
        input.add(-1);
        List<Integer> result = new ArrayList<>(input);
        return result;
    }


    public int[] solution(int[] nums) {
        HashSet<Integer> filter = new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            filter.add(nums[i]);
        }
        int[] result = filter.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return result;
    }

    public boolean solution(String pally) {
        String reversePally = "";
        for (int i = pally.length() - 1; i >= 0; i--) {
            reversePally += pally.charAt(i);
        }
        if (pally.equals(reversePally)) {
            return true;
        } else return false;
    }


    public static void main(String[] args) {
        String argument = "always in reverse, like the French Army";
        String parentheses = ")(((())))(";
        TestApp test = new TestApp();
        System.out.println(test.method(argument));
        System.out.println(test.fizzBuzz(100));
        Animal dog = new Dog();
        dog.sound();
        dog.limbs();
        Animal spider = new Spider();
        spider.sound();
        spider.limbs();
        var stream = argument.lines();
        System.out.println("Stream solution: " + test.solution(stream));
        System.out.println("Parentheses: " + test.practice(parentheses));
        System.out.println("Alternate Parentheses: " + test.parentheses(parentheses));
        System.out.println(test.removeDuplicates());
        System.out.println(test.solution("radar"));
        System.out.println("Practice/Testing");
        System.out.println();


        Scanner sc = new Scanner(System.in);
        boolean correctLength = false;
        while(!correctLength) {
            System.out.println("Please enter nine (9) Xs, Os or _ s:");
//        String input = "_________";
            String input = sc.nextLine().toUpperCase();
            String [] firstField = {String.valueOf(input.charAt(0)), String.valueOf(input.charAt(1)), String.valueOf(input.charAt(2))};
            String [] secondField = {String.valueOf(input.charAt(3)), String.valueOf(input.charAt(4)), String.valueOf(input.charAt(5))};
            String [] thirdField = {String.valueOf(input.charAt(6)), String.valueOf(input.charAt(7)), String.valueOf(input.charAt(8))};
            if(input.length() == 9) {
                correctLength = true;
                System.out.println("-------");
                System.out.println("|" + Arrays.toString(firstField).replace(",", "").replace("[", "").replace("]", "") + "|");
                System.out.println("|" + Arrays.toString(secondField).replace(",", "").replace("[", "").replace("]", "")  + "|");
                System.out.println("|" + Arrays.toString(thirdField).replace(",", "").replace("[", "").replace("]", "") + "|");
                System.out.println("-------");
            } else {
                System.out.println("You must choose 9 characters.");
            }

        }

    }


}
