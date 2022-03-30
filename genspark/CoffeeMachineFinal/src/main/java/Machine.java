import java.util.Locale;
import java.util.Scanner;

public class Machine {
    MachineState state = new MachineState(400, 540, 120, 9, 550);
    Beverage esp = new Beverage(250, 0, 16, 4);
    Beverage lat = new Beverage(350, 75, 20, 7);
    Beverage cap = new Beverage(200, 100, 12, 6);
    static Scanner sc = new Scanner(System.in);
    static boolean off = false;

    public void onOff() {
        while (!off) {
            options();
        }
    }

    public void options() {
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
                state.printState();
                break;
            case "exit":
                off = true;
                break;
            default:
                System.out.println("Please choose from the available menu.");
                options();
        }
    }

    public void verifySupply() {
        int purchase = 0;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        if (sc.hasNextInt()) {
            purchase = Integer.parseInt(sc.nextLine());
        } else {
            System.out.println(sc.nextLine() + " is not an integer.");
        }
        switch (purchase) {
            case 1:
                if (state.getWaterSupply() < esp.getWater()) {
                    System.out.println("Sorry, not enough water!");
                    options();
                } else if (state.getBeanSupply() < esp.getBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                    options();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    state.setCupSupply(state.getCupSupply() - 1);
                    state.setWaterSupply(state.getWaterSupply() - esp.getWater());
                    state.setBeanSupply(state.getBeanSupply() - esp.getBeans());
                    state.setCash(state.getCash() + esp.getCash());
                }
                break;
            case 2:
                if (state.getWaterSupply() < lat.getWater()) {
                    System.out.println("Sorry, not enough water!");
                    options();
                } else if (state.getMilkSupply() < lat.getMilk()) {
                    System.out.println("Sorry, not enough milk!");
                    options();
                } else if (state.getBeanSupply() < lat.getBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                    options();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    state.setCupSupply(state.getCupSupply() - 1);
                    state.setWaterSupply(state.getWaterSupply() - lat.getWater());
                    state.setMilkSupply(state.getMilkSupply() - lat.getMilk());
                    state.setBeanSupply(state.getBeanSupply() - lat.getBeans());
                    state.setCash(state.getCash() + lat.getCash());
                }
                break;
            case 3:
                if (state.getWaterSupply() < cap.getWater()) {
                    System.out.println("Sorry, not enough water!");
                    options();
                } else if (state.getMilkSupply() < cap.getMilk()) {
                    System.out.println("Sorry, not enough milk!");
                    options();
                } else if (state.getBeanSupply() < cap.getBeans()) {
                    System.out.println("Sorry, not enough coffee beans!");
                    options();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    state.setCupSupply(state.getCupSupply() - 1);
                    state.setWaterSupply(state.getWaterSupply() - cap.getWater());
                    state.setMilkSupply(state.getMilkSupply() - cap.getMilk());
                    state.setBeanSupply(state.getBeanSupply() - cap.getBeans());
                    state.setCash(state.getCash() + cap.getCash());
                }
                break;
            default:
                System.out.println("Please choose from the available menu.");
                options();
        }
        System.out.println();
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        state.setWaterSupply(state.getWaterSupply() + Integer.parseInt(sc.nextLine()));
        System.out.println("Write how many ml of milk you want to add: ");
        state.setMilkSupply(state.getMilkSupply() + Integer.parseInt(sc.nextLine()));
        System.out.println("Write how many grams of coffee beans you want to add: ");
        state.setBeanSupply(state.getBeanSupply() + Integer.parseInt(sc.nextLine()));
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        state.setCupSupply(state.getCupSupply() + Integer.parseInt(sc.nextLine()));
        System.out.println();
    }

    public void take() {
        System.out.println("I gave you $" + state.getCash());
        state.setCash(0);
        System.out.println();
    }
}
