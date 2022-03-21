import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0, prv = 0; i < len; i++) {
            int num = scan.nextInt();

            if (!map.containsKey(num))
                map.put(num, new HashSet<>());

            if (i > 0)
                map.get(prv).add(num);

            prv = num;
        }

        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean res = !map.containsKey(n) || !map.containsKey(m) || !map.get(n).contains(m) && !map.get(m).contains(n);
        System.out.println(res);
    }

}
