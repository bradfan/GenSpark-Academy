import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int counter = 0;
        int[] array = new int[len];
        for (int i = 0; i <= array.length - 1; i++) {
            if (sc.hasNext()) {
                array[i] = sc.nextInt();
            }
        }
        for (int i = 0; i <= len - 3; i++) {
            if (array[i + 1] - array[i] == 1 && array[i + 2] - array[i] == 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}