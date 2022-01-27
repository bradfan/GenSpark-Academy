import javax.swing.*;
import java.nio.charset.StandardCharsets;

public class Goblin {
    private boolean isAlive = true;
    private int hitPoints = 10;

    //default constructor
    public Goblin() {

    }
    //    parameterized constructor
    public Goblin(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    //    setters and getters
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void goblinAttack(Human human) {
        try {
            int damage = (int)(Math.random() * 10);
            if (damage >= human.getHitPoints()) {
                human.setHitPoints(0);
                System.out.println("Goblin won!");
            } else {
                human.setHitPoints(human.getHitPoints() - damage);
                this.setHitPoints(this.getHitPoints() - damage);
                System.out.println("Human is wounded.");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean goblinAlive(int hp) {
        hitPoints = hp;
        if(hp <= 0) {
            isAlive = false;
        }
        return true;
    }


    public String toString(){
        String goblinGrid = "0";
        byte[] bytes = goblinGrid.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        return utf8EncodedString + " ";
    }

}
