import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String result = "";
        int min = Integer.MAX_VALUE;
        int delta = 0;
        String[] input = sc.nextLine().split(" ");
        int query = sc.nextInt();
        int[] parseInput = new int[input.length];

        for (int i = 0; i <= input.length - 1; i++) {
            parseInput[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(parseInput);

        for (int e : parseInput) {
            delta = Math.abs(e - query);
            if (delta < min) {
                min = delta;
            }
        }
        for (int e : parseInput) {
            if (e == query - min || e == query + min) {
                result += e + " ";
            }
        }
        System.out.println(result);
    }
}