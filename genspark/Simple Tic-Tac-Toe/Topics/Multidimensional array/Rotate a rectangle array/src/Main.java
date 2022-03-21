import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] twoDimArray = new int[rows][columns];
        int[][] resultArray = new int[columns][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                twoDimArray[r][c] = sc.nextInt();
//              resultArray[c][rows - 1 - r] = twoDimArray[r][c];
//              can be inserted here and take out the second for loop.
            }
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                resultArray[c][rows - 1 - r] = twoDimArray[r][c];
            }
        }
        for (int r = 0; r < resultArray.length; r++) {
            for (int c = 0; c < resultArray[r].length; c++) {
                System.out.print(resultArray[r][c] + " ");
            }
            System.out.println();
        }
//        double "for each" loop to replace third for loop
//        for (int[] ints : resultArray) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
    }
}
