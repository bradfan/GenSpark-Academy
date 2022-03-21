import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int input = 0;
        int max = Integer.MIN_VALUE;
        int answerRow = 0;
        int answerCol = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                input = sc.nextInt();
                if (max < input) {
                    max = input;
                    answerRow = r;
                    answerCol = c;
                }
            }
        }
        System.out.println(answerRow + " " + answerCol);
    }
}