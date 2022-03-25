package machine;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    static int[] espressoArray = {250, 0, 16, 4};
    static int[] latteArray = {350, 75, 20, 7};
    static int[] cappuccinoArray = {200, 100, 12, 6};
    static int waterSupply = 400;
    static int milkSupply = 540;
    static int beanSupply = 120;
    static int cupSupply = 9;
    static int cash = 550;
    static boolean off = false;

    public static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(waterSupply + " ml of water");
        System.out.println(milkSupply + " ml of milk");
        System.out.println(beanSupply + " g of coffee beans");
        System.out.println(cupSupply + " disposable cups");
        System.out.println("$" + cash + " of money");
        System.out.println();
    }

    public static void options() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = sc.nextLine().toLowerCase(Locale.ROOT);
        switch (action) {
            case "buy":
                verifySupply();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                printState();
                break;
            case "exit":
                off = true;
                break;
            default:
                System.out.println("Please choose from the available menu.");
                options();
        }
    }

    public static void verifySupply() {
        int purchase = 0;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        if (sc.hasNextInt()) {
            purchase = Integer.parseInt(sc.nextLine());
        } else {
            System.out.println(sc.nextLine() + " is not an integer.");
        }
        switch (purchase) {
            case 1:
                if (waterSupply < espressoArray[0]) {
                    System.out.println("Sorry, not enough water!");
                    options();
                } else if (beanSupply < espressoArray[2]) {
                    System.out.println("Sorry, not enough coffee beans!");
                    options();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    cupSupply--;
                    waterSupply -= espressoArray[0];
                    beanSupply -= espressoArray[2];
                    cash += espressoArray[3];
                }
                break;
            case 2:
                if (waterSupply < latteArray[0]) {
                    System.out.println("Sorry, not enough water!");
                    options();
                } else if (milkSupply < latteArray[1]) {
                    System.out.println("Sorry, not enough milk!");
                    options();
                } else if (beanSupply < latteArray[2]) {
                    System.out.println("Sorry, not enough coffee beans!");
                    options();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    cupSupply--;
                    waterSupply -= latteArray[0];
                    milkSupply -= latteArray[1];
                    beanSupply -= latteArray[2];
                    cash += latteArray[3];
                }
                break;
            case 3:
                if (waterSupply < cappuccinoArray[0]) {
                    System.out.println("Sorry, not enough water!");
                    options();
                } else if (milkSupply < cappuccinoArray[1]) {
                    System.out.println("Sorry, not enough milk!");
                    options();
                } else if (beanSupply < cappuccinoArray[2]) {
                    System.out.println("Sorry, not enough coffee beans!");
                    options();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    cupSupply--;
                    waterSupply -= cappuccinoArray[0];
                    milkSupply -= cappuccinoArray[1];
                    beanSupply -= cappuccinoArray[2];
                    cash += cappuccinoArray[3];
                }
                break;
            default:
                System.out.println("Please choose from the available menu.");
                options();
        }
        System.out.println();
    }

    public static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        waterSupply += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many ml of milk you want to add: ");
        milkSupply += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add: ");
        beanSupply += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cupSupply += Integer.parseInt(sc.nextLine());
        System.out.println();
    }

    public static void take() {
        System.out.println("I gave you $" + cash);
        cash -= cash;
        System.out.println();
    }

    public static void main(String[] args) {
        while (!off) {
            options();
        }
    }
}
