public class Index {


    public static void main(String[] args) {
        GUI gui = new GUI();
        Land land = new Land();
        Human human = new Human();
        Goblin goblin = new Goblin();
//      human.setLocation(24);
        human.isAlive();
        goblin.getLocation();
        goblin.isAlive();
//      land.createGrid();
//      land.setHumanLocation(human);
//       land.setGoblinLocation(goblin);
    }
}
