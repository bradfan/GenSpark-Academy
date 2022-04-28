import java.util.Scanner;

class Main {
    public static boolean alphabet() {
        boolean consecutive = true;
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();
        if (array.length == 0 || array.length == 1) {
            return true;
        }
        int[] ascii = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ascii[i] = array[i];
        }
        for (int i = 0; i < ascii.length - 1; i++) {
            if (ascii[i] + 1 != ascii[i + 1]) {
                consecutive = false;
            }
        }
        return consecutive;
    }

    public static void main(String[] args) {
        System.out.println(alphabet());

    }
}