import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Worksheet_4_25 {

    public static long arrayPattern(int index, int size) {
        long[] result = new long[size];
        if (index > size || size > 75) {
            System.out.println("""
                    Number input is incorrect for a variety of reasons; 
                    we do not have the time, patience or crayons 
                    to explain it to you.""");
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


    public static void main(String[] args) {
        arrayPattern(75, 75);

    }
}
