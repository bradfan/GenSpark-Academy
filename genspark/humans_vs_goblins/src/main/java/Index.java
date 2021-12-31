import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        System.out.println("""
                
                As you were briefed before the mission,
                you have been dropped into the center of the Goblin Maze!
                Somewhere in this maze, a nasty Goblin is guarding it's treasure!
                It's your job to find this creature, destroy it and claim your prize!
                Navigate this terrible place by using
                n for North,
                s for South,
                w for West,
                and e for East.
                The grid coordinates below will help you in your quest!
                """);
        String whereDoYouGo = """
                
                The goblin isn't here. Do you move N, S, E or W?""";
        Land land = new Land();
        Human human = new Human();
        human.setLocation(12);
        Goblin goblin = new Goblin();
        ArrayList<Object> grid = new ArrayList<>();
        land.createGrid();
        land.setGoblinLocation(goblin);
        System.out.println("For dev: goblin is on grid: " + land.getGoblinLocation(goblin));
        land.setHumanLocation(human);
        System.out.println("You are on grid: " + human.getLocation() + ".");

       while(human.getLocation() != goblin.getLocation()) {
            System.out.println(whereDoYouGo);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String firstChar = input.charAt(0) + "";

            switch(firstChar) {
                case "n": {
                    land.humanMovesNorth(human);
//                    land.grid.set(grid.indexOf(human), "X");
                    System.out.println("You are on grid: " + human.getLocation() + ".");
                    break;
                }
                case "s": {
                    land.humanMovesSouth(human);
//                    land.grid.set(grid.indexOf(human), "X");
                    System.out.println("You are on grid: " + human.getLocation() + ".");
                    break;
                }
                case "w": {
                    land.humanMovesWest(human);
//                    land.grid.set(grid.indexOf(human), "X");
                    System.out.println("You are on grid: " + human.getLocation() + ".");
                    break;
                }
                case "e": {
                    land.humanMovesEast(human);
//                    land.grid.set(grid.indexOf(human), "X");
                    System.out.println("You are on grid: " + human.getLocation() + ".");
                    break;
                }  default:
                    System.out.println("You must input either n, s, w or e.");

            }


       }

    }


}
