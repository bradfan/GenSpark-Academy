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
        human.setLocation(24);

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
                   land.createGrid();
                    //revisit this re: UTF characters
                   if(human.getLocation() == 0 ||
                           human.getLocation() == 1 ||
                           human.getLocation() == 2 ||
                           human.getLocation() == 3 ||
                           human.getLocation() == 4) {
                       System.out.println("You are at the North edge of the maze and can go no further in that direction.");
                   } else  land.humanMovesNorth(human);
                   System.out.println("You are on grid coordinate: " + human.getLocation() + ".");
                    break;
                }
                case "s": {
                    land.createGrid();
                    //revisit this re: UTF characters
                    if(human.getLocation() == 20 ||
                            human.getLocation() == 21 ||
                            human.getLocation() == 22 ||
                            human.getLocation() == 23 ||
                            human.getLocation() == 24) {
                        System.out.println("You are at the South edge of the maze and can go no further in that direction.");
                    } else land.humanMovesSouth(human);

                    System.out.println("You are on grid coordinate: " + human.getLocation() + ".");
                    break;
                }
                case "w": {
                    land.createGrid();
                    //revisit this re: UTF characters
                    if(human.getLocation() == 0 ||
                            human.getLocation() == 5 ||
                            human.getLocation() == 10 ||
                            human.getLocation() == 15 ||
                            human.getLocation() == 20) {
                        System.out.println("You are at the West edge of the maze and can go no further in that direction.");
                    } else land.humanMovesWest(human);

                    System.out.println("You are on grid coordinate: " + human.getLocation() + ".");
                    break;
                }
                case "e": {
                    land.createGrid();
                    //revisit this re: UTF characters
                    if(human.getLocation() == 4 ||
                            human.getLocation() == 9 ||
                            human.getLocation() == 14 ||
                            human.getLocation() == 19 ||
                            human.getLocation() == 24) {
                        System.out.println("You are at the East edge of the maze and can go no further in that direction.");
                    } else land.humanMovesEast(human);

                    System.out.println("You are on grid coordinate: " + human.getLocation() + ".");
                    break;
                }  default:
                    System.out.println("You must input either n, s, w or e.");

            }


       }

    }


}
