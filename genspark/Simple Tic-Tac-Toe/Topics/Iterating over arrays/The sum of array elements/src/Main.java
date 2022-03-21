import java.util.*;

class Main {
    
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int sum = 0;
    
        for (int i = 0; i <= length; i++) {
            if (sc.hasNext()) {
                sum += sc.nextInt();
            }
        }
        System.out.println(sum);
    }
}
