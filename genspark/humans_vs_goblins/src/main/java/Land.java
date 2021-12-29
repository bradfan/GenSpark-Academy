import java.util.ArrayList;

public class Land {

       public Land() {

       }


    public void createGrid(ArrayList<Object> grid) {

//        String newGrid[][] = new String[][] {{"[]", "[]", "[]", "[]", "[]"},
//                                            {"[]", "[]", "[]", "[]", "[]"},
//                                            {"[]", "[]", "[]", "[]", "[]"},
//                                            {"[]", "[]", "[]", "[]", "[]"},
//                                            {"[]", "[]", "[]", "[]", "[]"}};

        for(int rows = 0; rows < 5; rows++) {
                System.out.println(grid.get(rows));
                for(int cols = 0; cols < 5; cols++) {
                    System.out.print(grid.get(cols) + " ");
                }
            System.out.println();
            }

    }

}
