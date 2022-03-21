import java.util.*;

class Main {
    
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);  
        int len = sc.nextInt();
        int[] array = new int[len];
        boolean doesContain = false;
        for (int i = 0; i <= array.length - 1; i++) {
            if (sc.hasNext()) {
                array[i] = sc.nextInt();
            }
        } 
        int match = sc.nextInt();
        for (int number : array) {
            if (number == match) {
                doesContain = true;
            }
        }
        System.out.println(doesContain); 
    }
}
