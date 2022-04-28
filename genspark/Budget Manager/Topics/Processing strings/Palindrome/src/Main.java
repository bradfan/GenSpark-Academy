import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String isPally = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            isPally += input.charAt(i);
        }
        System.out.println(input.equals(isPally) ? "yes" : "no");
    }
}

// if (input.equals(isPally)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }