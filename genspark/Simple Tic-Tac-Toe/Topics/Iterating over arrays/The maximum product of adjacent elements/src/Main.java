import java.util.*;

class Main {
    
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        int product = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (sc.hasNext()) {
                array[i] = sc.nextInt();
            }
        }
        int maxAdj = array[0] * array[1];
        for (int j = 0; j <= array.length - 2; j++) {
            product = array[j] * array[j + 1];
            if (product > maxAdj) {
                maxAdj = product;
            }
        }
        System.out.println(maxAdj);
    }
}
