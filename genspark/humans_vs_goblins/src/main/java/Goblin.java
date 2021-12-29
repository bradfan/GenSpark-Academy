

public class Goblin {
    private boolean isAlive;
    private int location;
    private int hitPoints = 20;
    //    offense to be determined randomly during combat
    private int offense;


    //default constructor
    public Goblin() {

    }
    //    parameterized constructor
    public Goblin(int hitPoints, int offense, int location) {
        this.hitPoints = hitPoints;
        this.offense = offense;

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


    public void goblinAttack(Human human) {
        try {
            int damage = (int)(Math.random() * 10);
            if (damage >= human.getHitPoints()) {
                human.setHitPoints(0);
            } else {
                human.setHitPoints(human.getHitPoints() - damage);
//                this.setHitPoints(this.getHitPoints() - damage);
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

}




