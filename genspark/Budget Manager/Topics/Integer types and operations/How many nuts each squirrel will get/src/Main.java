import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int squirrels = sc.nextInt();
        int nuts = sc.nextInt();
        System.out.println(nuts / squirrels);
    }
}