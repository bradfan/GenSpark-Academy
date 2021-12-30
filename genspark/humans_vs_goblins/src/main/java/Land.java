import java.util.ArrayList;

public class Land {

    ArrayList<Object> grid = new ArrayList<>();

       public Land() {

       }

       public void createGrid() {
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
       }

       public void setGoblinLocation(Goblin goblin) {
           int goblinStart = (int) (Math.random() *24);
           grid.set(goblinStart, goblin);
       }
       public int getGoblinLocation(Goblin goblin) {
           if (grid.contains(goblin)) {
               return grid.indexOf(goblin);
           } return 99;
       }
       public void setHumanLocation(Human human) {
        int humanStart = 12;
        grid.set(humanStart, human);
    }
      public int getHumanLocation(Human human) {
//           int currentIndex = grid.indexOf(human);
        if (grid.contains(human)) {
//            System.out.print(grid.set(currentIndex, 88));
//            grid.set keeps setting indexOf(human) to '-1' no matter the second object
            return grid.indexOf(human);
        } return 99;
    }

    public int humanMoveNorth(Human human) {
           human.setLocation(human.getLocation() - 5);
           return human.getLocation();
      }
    public int humanMoveSouth(Human human) {
        human.setLocation(human.getLocation() + 5);
        return human.getLocation();
    }
    public int humanMoveWest(Human human) {
        human.setLocation(human.getLocation() - 1);
        return human.getLocation();
    }
    public int humanMoveEast(Human human) {
        human.setLocation(human.getLocation() +1);
        return human.getLocation();
    }



}


