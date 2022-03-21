class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int[] firstRow = twoDimArray[0];
        int[] secondRow = twoDimArray[twoDimArray.length - 1];

        System.out.println(firstRow[0] + " " + firstRow[firstRow.length - 1]);
        System.out.println(secondRow[0] + " " + secondRow[secondRow.length - 1]);

    }
}