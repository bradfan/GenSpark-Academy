import java.util.*;

class Main {
    
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); 
        int count = 0;
        int[] array = new int[len];

        for (int i = 0; i <= len - 1; i++) {
            if (sc.hasNext()) {
                array[i] += sc.nextInt();
            }
        }
        int dup = sc.nextInt(); 
        for (int numbers: array) {
            if (numbers == dup) {
                count++;
            }
        }
        System.out.println(count);
    }
}
