import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max && array[i] % 4 == 0) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}