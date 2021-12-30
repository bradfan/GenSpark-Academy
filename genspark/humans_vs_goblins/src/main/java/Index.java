

public class Index {

    public static void main(String[] args) {
        Land land = new Land();
        Human human = new Human();
        Goblin goblin = new Goblin();
        int [][] grid = {{10, 11, 12, 13, 14},
                         {15, 16, 17, 18, 19},
                         {20, 21, 22, 23, 24},
                         {25, 26, 27, 28, 29},
                         {30, 31, 32, 34, 35}};

        for(int rows = 0; rows < 5; rows++) {
            System.out.println();
            for(int cols = 0; cols < 5; cols++) {
                System.out.print(grid[rows][cols] + " ");
            }
            System.out.println();
        }






    }
}
