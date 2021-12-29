

public class Human {
    private boolean isAlive;
    private int location;
    private int hitPoints = 20;
    private int offense = 20;
    private int defense = 10;

//default constructor
    public Human() {

    }
//    parameterized constructor
    public Human(int hitPoints, int offense, int defense) {
        this.hitPoints = hitPoints;
        this.offense = offense;
        this.defense = defense;
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

    public void setLocation(int location) {
        this.location = location;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getOffense() {
        return offense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}


