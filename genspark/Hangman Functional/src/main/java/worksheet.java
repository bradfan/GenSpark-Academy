import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class worksheet {
    public void retrieveDisplay(int tries) throws IOException {

        try{
            String displayOne = null;
            List<String> one = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayOne = one.stream().collect(Collectors.joining("\n"));
            System.out.print(displayOne);
            System.out.println();
            String displayTwo = null;
            List<String> two = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayTwo = two.stream().collect(Collectors.joining("\n"));
            System.out.print(displayTwo);
            System.out.println();
            String displayThree = null;
            List<String> three = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayThree = three.stream().collect(Collectors.joining("\n"));
            System.out.print(displayThree);
            System.out.println();

            switch (tries) {
                case 1:
                    System.out.print(displayThree);
                    break;
                case 2:
                    System.out.print(displayTwo);
                    break;
                case 3:
                    System.out.print(displayOne);
                    break;
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }



    }


// public String RetrieveDisplayOne() throws IOException {
//          String displayOne = null;
//          try {
//              List<String> one = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
//              displayOne = one.stream().collect(Collectors.joining("\n"));
//              System.out.print(displayOne);
//              System.out.println();
//          } catch (Exception e) {
//              System.out.println(e.getMessage());
//          }
//          return displayOne;
//      }
//    public String RetrieveDisplayTwo() throws IOException {
//        String displayTwo = null;
//        try {
//            List<String> two = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
//            displayTwo = two.stream().collect(Collectors.joining("\n"));
//            System.out.print(displayTwo);
//            System.out.println();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return displayTwo;
//    }
//    public String RetrieveDisplayThree() throws IOException {
//        String displayThree = null;
//        try {
//            List<String> three = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
//            displayThree = three.stream().collect(Collectors.joining("\n"));
//            System.out.print(displayThree);
//            System.out.println();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return displayThree;
//    }




