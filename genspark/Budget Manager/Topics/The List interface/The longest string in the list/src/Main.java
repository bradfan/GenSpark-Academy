import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int max = 0;
        String longest = "";
        for (String string : list) {
            if (string.length() > max) {
                max = string.length();
                longest = string;
            }
        }
        Collections.fill(list, longest);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}