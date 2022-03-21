// You can experiment here, it won’t be checked

import java.util.Arrays;
import java.util.Scanner;

public class Task {

public void findTheCorners(int[][] array) {
    int[] firstRow = array[0];
    int[] secondRow = array[array.length-1];

    System.out.println(firstRow[0] + " " + firstRow[firstRow.length-1]);
    System.out.println(secondRow[0] + " " + secondRow[secondRow.length-1]);







}



    public static void main(String[] args) {
        // put your code here
        int[][] twoDim = {
                {1, 2, 3},
                {4, 5, 6}};

        Task task = new Task();
        task.findTheCorners(twoDim);




    }
}
