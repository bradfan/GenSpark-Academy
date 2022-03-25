package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    static int requiredWater = 200;
    static int requiredMilk = 50;
    static int requiredBeans = 15;

    public static void printSteps() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

    }

    public static void ingredientRatio() {
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = sc.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need: ");
        System.out.println(cups * requiredWater + " ml of water");
        System.out.println(cups * requiredMilk + " ml of milk");
        System.out.println(cups * requiredBeans + " g of coffee beans");

    }

    public static void numberOfServings() {
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterSupply = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkSupply = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beanSupply = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int coffeeOrder = sc.nextInt();
        int[] totalArray = new int[3];
        totalArray[0] = waterSupply / requiredWater;
        totalArray[1] = milkSupply / requiredMilk;
        totalArray[2] = beanSupply / requiredBeans;
        int cupsPossible = Integer.MAX_VALUE;

        for (int i = 0; i < totalArray.length; i++) {
            if (totalArray[i] < cupsPossible) {
                cupsPossible = totalArray[i];
            }
        }

        int surplus = cupsPossible - coffeeOrder;
        if (cupsPossible > coffeeOrder) {
            System.out.println("Yes, I can make that amount of coffee (and even " + surplus + " more than that)");
        } else if (cupsPossible == coffeeOrder) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("No, I can make only " + cupsPossible + " cup(s) of coffee");
        }
    }

    public static void main(String[] args) {
//        printSteps();
//        ingredientRatio();
        numberOfServings();


    }
}
