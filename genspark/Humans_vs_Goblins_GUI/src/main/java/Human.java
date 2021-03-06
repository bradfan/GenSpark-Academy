import java.nio.charset.StandardCharsets;

public class Human {
    private boolean isAlive = true;
    private int hitPoints = 12;

    //default constructor
    public Human() {

    }

    //    parameterized constructor
    public Human(int hitPoints) {
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

    public void humanAttack(Goblin goblin) {
        try {
            int damage = (int)(Math.random() * 10);
            if (damage >= goblin.getHitPoints()) {
                goblin.setHitPoints(0);
                System.out.println("You wasted his ass!");
            } else {
                goblin.setHitPoints(goblin.getHitPoints() - damage);
                this.setHitPoints(this.getHitPoints() - damage);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean humanAlive(int hp) {
        hitPoints = hp;
        if(hp <= 0) {
            isAlive = false;
        }
        return true;
    }

    public String toString(){
        String humanGrid = "X";
        byte[] bytes = humanGrid.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        return utf8EncodedString + " ";
    }


}

