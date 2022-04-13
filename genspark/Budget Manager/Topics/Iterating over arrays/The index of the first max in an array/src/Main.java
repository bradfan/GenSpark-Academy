import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        int index = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            if (sc.hasNext()) {
                a[i] = sc.nextInt();
            }
            if (a[i] > a[index]) {
                index = i;
            }
        }
        System.out.println(index);
    }
}
