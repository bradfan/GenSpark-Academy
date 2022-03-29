package machine;

public class MachineState {
    private int waterSupply;
    private int milkSupply;
    private int beanSupply;
    private int cupSupply;
    private int cash;

    public MachineState(int waterSupply, int milkSupply, int beanSupply, int cupSupply, int cash) {
        this.waterSupply = waterSupply;
        this.milkSupply = milkSupply;
        this.beanSupply = beanSupply;
        this.cupSupply = cupSupply;
        this.cash = cash;
    }

    public int getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(int waterSupply) {
        this.waterSupply = waterSupply;
    }

    public int getMilkSupply() {
        return milkSupply;
    }

    public void setMilkSupply(int milkSupply) {
        this.milkSupply = milkSupply;
    }

    public int getBeanSupply() {
        return beanSupply;
    }

    public void setBeanSupply(int beanSupply) {
        this.beanSupply = beanSupply;
    }

    public int getCupSupply() {
        return cupSupply;
    }

    public void setCupSupply(int cupSupply) {
        this.cupSupply = cupSupply;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }


    public void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(getWaterSupply() + " ml of water");
        System.out.println(getMilkSupply() + " ml of milk");
        System.out.println(getBeanSupply() + " g of coffee beans");
        System.out.println(getCupSupply() + " disposable cups");
        System.out.println("$" + getCash() + " of money");
        System.out.println();
    }
}
