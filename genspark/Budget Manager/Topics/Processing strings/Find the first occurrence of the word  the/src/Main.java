import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your righteous code here, dude...
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(input.indexOf("the"));
    }
}
