public class Index {


    public static void main(String[] args) {
        System.out.println();
        String whereDoYouGo = """
                The goblin isn't here. Do you move N, S, E or W?""";

               GUI gui = new GUI();
               Land land = new Land();
               Human human = new Human();
               Goblin goblin = new Goblin();
               human.setLocation(24);
               human.isAlive();
               goblin.setLocation(0);
               goblin.isAlive();
               land.createGrid();
               land.setHumanLocation(human);
        System.out.println("You are on grid coordinate: " + human.getLocation() + ".");
        land.setGoblinLocation(goblin);








    }
}
