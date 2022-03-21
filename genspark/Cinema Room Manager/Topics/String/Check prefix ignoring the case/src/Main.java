import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println(str.startsWith("J"));
    }
}