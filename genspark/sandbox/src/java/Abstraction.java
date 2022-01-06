public class Abstraction {

    private int age;
    private String name;

    // default constructor
    public Abstraction() {

    }
    //parameterized constructor
    public Abstraction(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int yearsUntil25() {
        int result = 25 - age;
        return result;
    }


}




