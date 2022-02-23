public class AssessmentApp {

    public static class Variable {
        private int numberOfLimbs = 4;

        //    default Constructor
        public Variable() {

        }
//the variable is a private int but the getters and setters are public
        public Variable(int limbs) {
            this.numberOfLimbs = limbs;
        }

        public int getLimbs() {
            return numberOfLimbs;
        }

        public void setLimbs(int limbs) {
            this.numberOfLimbs = limbs;
        }
    }

    // Animal is an ABSTRACT class so it's methods can not be DIRECTLY instantiated except through the child class(es.)
    public static abstract class Animal {
        public void sound() {
            System.out.println("Noise");
        }

        public int limbs(int limbs) {
            return limbs;
        }
    }

//    Dog "extends" the Animal class thereby becoming the Animals child class
    public static class Dog extends Animal {
        public void sound() {
            System.out.println("Most dogs bark");
        }
    }


    public static void main(String[] args) {
//        instantiate the Variable class for access
        Variable variable = new Variable();
//        instantiate the parent class along with the child class.
        Animal dog = new Dog();
//           because dog extends animal, polymorphism occurs when the sound method originally declared in the Animal parent class is changed in the child class.
        dog.sound();
        //  because dog extends animal, INHERITANCE occurs when the limbs method is called via the Dog object even though it isn't evident in the child class.
//      ENCAPSULATION:  we are accessing the number of limbs provided in the Variable class which is private but accessible through the getter
        System.out.println("Dogs are usually born with " + dog.limbs(variable.getLimbs()) + " limbs.");
    }
}
