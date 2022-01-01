import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        System.out.println("""
                
                As you were briefed before the mission,
                you have entered the Goblin Maze its SE corner and the
                only way in or out closed behind you!
                Somewhere in this maze, a nasty Goblin is looking for you!
                It's your job to find this creature and destroy it!
                The only way out is to kill or be killed!
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
        human.isAlive();
        Goblin goblin = new Goblin();
        goblin.setLocation(12);
        goblin.isAlive();
        ArrayList<Object> grid = new ArrayList<>();
        land.createGrid();
        land.setGoblinLocation(goblin);
        System.out.println("For dev: goblin is on grid: " + goblin.getLocation());
        land.setHumanLocation(human);
        System.out.println("You are on grid: " + human.getLocation() + ".");

       while(human.isAlive() && goblin.isAlive()) {
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
                   }
                    else land.humanMovesNorth(human);
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
//end of switch statement
            }
           if(goblin.getLocation() + 1 == human.getLocation() ||
                   goblin.getLocation() - 1 == human.getLocation() ||
                   goblin.getLocation() + 5 == human.getLocation() ||
                   goblin.getLocation() - 5 == human.getLocation()) {
               goblin.goblinAttack(human);
           }

            if(human.getHitPoints() == 0) {
              human.setAlive(false);
                System.out.println("""
                        Goblin ATTACKS!!
                        You were attacked by that creepy goblin
                        and died in the Goblin Maze.""");
            } else human.humanAttack(goblin);
            if(goblin.getHitPoints() == 0) {
                goblin.setAlive(false);
                System.out.println("""
                        Goblin ATTACKS
                        but you fought that stinky goblin and wasted it!!
                        We will evacuate you from your current location.
                        Good job!!""");
            } else goblin.goblinAttack(human);
//end of the while loop
       }
//main
    }

//class
}
