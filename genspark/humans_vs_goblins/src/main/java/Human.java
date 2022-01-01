import java.nio.charset.StandardCharsets;

public class Human {
    private boolean isAlive = true;
    private int location;
    private int hitPoints = 10;

    //default constructor
    public Human() {

    }

    //    parameterized constructor
    public Human(int hitPoints, int offense, int location) {
        this.hitPoints = hitPoints;
        this.location = location;
    }

    //    setters and getters
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {this.location = location;}

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
            } else {
                goblin.setHitPoints(goblin.getHitPoints() - damage);
                this.setHitPoints(this.getHitPoints() - damage);
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }
    public String toString(){
        String humanGrid = "X";
        byte[] bytes = humanGrid.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        return utf8EncodedString + " ";
    }


}




