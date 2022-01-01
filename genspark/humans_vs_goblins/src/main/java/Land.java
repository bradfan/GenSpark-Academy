import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Land {

    ArrayList<Object> grid = new ArrayList<>();

       public Land() {

       }

       public void createGrid() {
           try {
               for (int i = 0; i < 5; i++) {
                   this.grid.add(i);
                   System.out.print(grid.get(i) + "  ");
               }
               System.out.println();
               for (int i = 5; i < 10; i++) {
                   this.grid.add(i);
                   System.out.print(grid.get(i) + "  ");
               }
               System.out.println();
               for (int i = 10; i < 15; i++) {
                   this.grid.add(i);
                   System.out.print(grid.get(i) + " ");
               }
               System.out.println();
               for (int i = 15; i < 20; i++) {
                   grid.add(i);
                   System.out.print(grid.get(i) + " ");
               }
               System.out.println();
               for (int i = 20; i < 25; i++) {
                   grid.add(i);
                   System.out.print(grid.get(i) + " ");
               }
               System.out.println();
           }catch (Exception e) {
               e.getMessage();
           }
       }
       public void setGoblinLocation(Goblin goblin) {
           grid.set(goblin.getLocation(), goblin);
       }
//       public int getGoblinLocation(Goblin goblin) {
//           if (grid.contains(goblin)) {
//               return grid.indexOf(goblin);
//           } return 99;
//       }

    public void setHumanLocation(Human human) {
           grid.set(human.getLocation(), human);
    }

    public void humanMovesNorth(Human human) {
           grid.set(human.getLocation() - 5, human);
           human.setLocation(human.getLocation() - 5);
       }
    public void humanMovesSouth(Human human) {
        grid.set(human.getLocation() + 5, human);
        human.setLocation(human.getLocation() + 5);

    }
    public void humanMovesWest(Human human) {
        grid.set(human.getLocation() - 1, human);
        human.setLocation(human.getLocation() - 1);

    }
    public void humanMovesEast(Human human) {
        grid.set(human.getLocation() + 1, human);
        human.setLocation(human.getLocation() + 1);

    }




    public String toString() {
           String landGrid = "You can check out any time you like but you can never leave...";
        byte[] bytes = landGrid.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        return utf8EncodedString + " ";
    }

}


