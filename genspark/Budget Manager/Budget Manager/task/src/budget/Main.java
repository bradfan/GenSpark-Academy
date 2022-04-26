package budget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static List<Integer> intro() {
        System.out.println("Please enter your purchases \n" +
                "as <Description> followed by the $ sign \n" +
                "followed by the amount spent. \n" +
                "Use Ctrl+z to enter a new purchase.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> purchaseList = new ArrayList<>();

        while (sc.hasNext()) {
            System.out.println(input);
            String[] collector = input.split(" ");
            purchaseList.add(Integer.valueOf(collector[collector.length - 1]));
        }
        System.out.println(purchaseList);
        return purchaseList;
    }


    public static void main(String[] args) {
        intro();

    }
}
