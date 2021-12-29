

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
    public Goblin(int hitPoints, int offense) {
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


//    add attack method here similar to the class problems example below?

//    public String attack(Object newObj) {
//        String result = "The zombie bites the human for " + Zombie.strength + " damage,";
////        takes an object and type casts it to a Human
//        Human human = new Human();
//         human = (Human) newObj;
//         if(human.getHealth() <= 3){
//             human.setHealth(human.getHealth() - Zombie.strength);
//             return  result + " the human has died...";
//         } else return result + " the human survives but will be turning soon...";
//
//}

}




