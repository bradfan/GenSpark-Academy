import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int duration = sc.nextInt();
        int food = sc.nextInt() * duration;
        int flights = sc.nextInt() * 2;
        int hotel = sc.nextInt() * (duration - 1);
        System.out.println(food + flights + hotel);
    }
}