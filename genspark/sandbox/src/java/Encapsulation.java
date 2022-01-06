


public class Encapsulation {
    private int age;
    private String name;

// default constructor
    public Encapsulation() {

    }

//parameterized constructor
    public Encapsulation(int age, String name) {
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
}
