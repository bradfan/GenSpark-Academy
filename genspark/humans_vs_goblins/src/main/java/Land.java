

public class Land {

       public Land() {

       }


    public void createGrid() {

        String grid[][] = new String[][] {{"[]", "[]", "[]", "[]", "[]"},
                                          {"[]", "[]", "[]", "[]", "[]"},
                                          {"[]", "[]", "[]", "[]", "[]"},
                                          {"[]", "[]", "[]", "[]", "[]"},
                                          {"[]", "[]", "[]", "[]", "[]"}};

        for(int rows = 0; rows < 5; rows++) {
                System.out.println();
                for(int cols = 0; cols < 5; cols++) {
                    System.out.print(grid[rows][cols] + " ");
                }
            System.out.println();
            }

    }

}
