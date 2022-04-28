import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int counter = 0;
        for (int e : list1) {
            if (e == elem) {
                counter++;
            }
        }
        for (int e : list2) {
            if (e == elem) {
                counter--;
            }
        }
        return counter == 0;
    }
}