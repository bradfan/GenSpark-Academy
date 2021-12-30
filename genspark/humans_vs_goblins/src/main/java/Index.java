import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        System.out.println("""
                As per your orders, you have been dropped into the center of the Goblin Maze!
                Somewhere in this maze, a nasty Goblin is guarding his treasure!
                When you find this creature, destroy it and claim your prize!
                Navigate this terrible place by using
                n for North,
                s for South,
                w for West,
                and e for East.""");
        String whereDoYouGo = "The goblin isn't here. Do you move N, S, E or W?";
        Land land = new Land();
        Human human = new Human();
        Goblin goblin = new Goblin();
        ArrayList<Object> grid = new ArrayList<>();
        land.createGrid();
        land.setGoblinLocation(goblin);
        System.out.println("For dev: goblin is on grid: " + land.getGoblinLocation(goblin));
        land.setHumanLocation(human);
        System.out.println("For dev: human is on grid: " + land.getHumanLocation(human));

        while(land.getHumanLocation(human) != land.getGoblinLocation(goblin) ) {
            System.out.println(whereDoYouGo);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String firstChar = input.charAt(0) + "";
            








        }





    }


}
