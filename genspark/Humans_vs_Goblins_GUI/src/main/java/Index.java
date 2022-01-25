public class Index {


    public static void main(String[] args) {
        System.out.println("""
                
                As you were briefed before the mission,
                you have entered the Goblin Maze its SE corner and the
                only way in or out closed behind you!
                Somewhere in this maze, a nasty Goblin is looking for you!
                It's your job to find this creature and destroy it,
                but he will always attack first! You have extra armor to help!
                Navigate this terrible place by using
                n for North,
                s for South,
                w for West,
                and e for East.
                The grid coordinates below will help you in your quest!
                """);
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
