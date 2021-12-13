package com.company;
import java.util.Scanner;

public class Main {

    public static <string> void main(String[] args) {
        System.out.println("""
                You are in a land full of dragons. In front of you,
                you see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon
                is greedy and hungry and will eat you on sight.
                Which cave will you go in to? (1 or 2)
                """);
        try {
            Scanner getInput = new Scanner(System.in);
            String input = getInput.nextLine();
            int inputNumber = Integer.parseInt(input);
            userResponse(inputNumber);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String userResponse(int x) {

        String result = """
                You approach the cave...
                It is dark and spooky...
                A large dragon jumps out in front of you! He opens his jaws and...
                """;
        if (x == 1) {
            System.out.println(result + "Gobbles you down in one bite!!");
            return result + "Gobbles you down in one bite!!";
        } else
            System.out.println(result + "Welcomes you in and shares his treasure!!");
            return result + "Welcomes you in and shares his treasure!!";
    }
}

//        Original Project 1:
//        System.out.println("""
//                You are in a land full of dragons. In front of you,
//                you see two caves. In one cave, the dragon is friendly
//                and will share his treasure with you. The other dragon
//                is greedy and hungry and will eat you on sight.
//                Which cave will you go in to? (1 or 2)
//                """);
//
//           Scanner getInput = new Scanner(System.in);
//           String input = getInput.nextLine();
//           String result = """
//                You approach the cave...
//                It is dark and spooky...
//                A large dragon jumps out in front of you! He opens his jaws and...
//                """;
//
//           if (input.equals("1")) System.out.println(result  + "Gobbles you down in one bite!!");
//           else if (input.equals("2")) System.out.println(result + "Welcomes you in and shares his treasure!!");
//     }
//    }

