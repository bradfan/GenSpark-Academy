import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // quit procrastinating and start coding here
        int a = sc.nextInt();
        int b = sc.nextInt();
        Long product = 1L;
        for (int i = a; i <= b - 1; i++) {
            product *= i;
        }
        System.out.println(product);

    }
}