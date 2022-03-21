import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String str = sc.nextLine();
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(str.substring(first, second + 1));
    }
}