import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int n = sc.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            System.out.print(n + " ");
        }
    }
}