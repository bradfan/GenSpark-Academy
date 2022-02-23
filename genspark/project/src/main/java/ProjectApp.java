import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProjectApp {
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
            } else result.add( i + " ");
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
        for (int i = example.length() - 1; i >= 0; i--){
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
        if(s.isEmpty()) return "unbalanced";
        for (var c : s.toCharArray()) {
//            must use single quotes ' character ' here and not double quotes " character "
            if (c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return "unbalanced";
                } else stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return "unbalanced";
        }
        return "balanced";
    }


    public static void main(String[] args) {
        String argument = "always in reverse, like the French Army";
        String parentheses = "(()(()))";
        ProjectApp project = new ProjectApp();
        System.out.println(project.method(argument));
        System.out.println(project.fizzBuzz(100));
        Animal dog = new Dog();
        dog.sound();
        dog.limbs();
        Animal spider = new Spider();
        spider.sound();
        spider.limbs();
        var stream = argument.lines();
        System.out.println("Stream solution: " + project.solution(stream));
        System.out.println("Parentheses: " + project.practice(parentheses));

    }


}
