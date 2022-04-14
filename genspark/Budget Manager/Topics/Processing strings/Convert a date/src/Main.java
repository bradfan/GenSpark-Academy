import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("-");

        System.out.println(input[1]
                + "/"
                + input[2]
                + "/"
                + input[0]);
    }
}