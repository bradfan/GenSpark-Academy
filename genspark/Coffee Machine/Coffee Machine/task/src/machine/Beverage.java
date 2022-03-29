package machine;

public class Beverage {
    private final int water;
    private final int milk;
    private final int beans;
    private final int cash;

    public Beverage(int water, int milk, int beans, int cash) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cash = cash;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCash() {
        return cash;
    }
}



