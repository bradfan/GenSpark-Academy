import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Worksheet_4_25 {

    public static long arrayPattern(int index, int size) {
        long[] result = new long[size];
        if (index > size || size > 75) {
            System.out.println("""
                    At least one of the numbers input is incorrect; 
                    either the index you requested 
                    is larger than than the size of the sequence or 
                    the sequence that you requested is too large for this 
                    program to process.""");
            return index;
        } else {
            result[0] = 0;
            result[1] = 1;

            for (int i = 2; i < size; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
            System.out.println(Arrays.toString(result));
            System.out.println(result[index - 1]);
        }
        return result[index - 1];
    }

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }
        return result;
    }

    static Integer find(final int[] array) {
        Integer result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (i == array.length - 1) {
                return null;
            }
            if (array[i] + 1 != array[i + 1]) {
                result = array[i] + 2;
                break;
            }
        }
        return result;
    }

    public static int oddCount(int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] map(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }

    public static int[] mapStream(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

    public static long[] powersOfTwo(int n) {
        long[] result = new long[n + 1];
        for (long i = 0; i <= n; i++) {
            result[(int) i] = (long) Math.pow(2, i);
        }
        return result;
    }

    public static int[] between(int a, int b) {
        int[] array = new int[(b - a) + 1];
        int x = 0;
        for (int i = a; i <= b; i++) {
            array[x] = i;
            x++;
        }
        return array;
    }

    public static int[] reflectPoint(int[] p, int[] q) {
        return new int[]{q[0] - (p[0] - q[0]), q[1] - (p[1] - q[1])};

    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(firstCuboid[0] * firstCuboid[1] * firstCuboid[2] - secondCuboid[0] * secondCuboid[1] * secondCuboid[2]);
    }

    public static long sumMul(int n, int m) throws IllegalArgumentException {
        long sum = 0;
        try {
            for (int i = n; i < m; i += n) {
                sum += i;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sum;
    }

    public static String smash(String... words) {
        return String.join(" ", words);
    }


    public static void main(String[] args) {
        arrayPattern(14, 15);
        System.out.println(countingSheep(5));
        int[] a = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(Arrays.toString(map(a)));
        System.out.println(Arrays.toString(mapStream(a)));
        System.out.println(find(a));
        System.out.println(oddCount(15023));
        System.out.println(Arrays.toString(powersOfTwo(100)));
        between(5, 10);
        int[] p = {3, 3};
        int[] q = {5, 5};
        System.out.println(Arrays.toString(reflectPoint(p, q)));
        System.out.println(sumMul(0, 0));
        System.out.println(smash("Up", "yours", "code", "wars"));


    }
}
