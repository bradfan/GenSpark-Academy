package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static <string> void main(String[] args) {
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

        System.out.println("""
                You are in a land full of dragons. In front of you,
                you see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon
                is greedy and hungry and will eat you on sight.
                Which cave will you go in to? (1 or 2)
                """);
        String result = """
                You approach the cave...
                It is dark and spooky...
                A large dragon jumps out in front of you! He opens his jaws and...
                """;
        try {
            Scanner getInput = new Scanner(System.in);
            String input = getInput.nextLine();
            int inputNumber = Integer.parseInt(input);
            if (inputNumber == 1) {
                System.out.println(result + "Gobbles you down in one bite!!");
            } else System.out.println(result + "Welcomes you in and shares his treasure!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}



