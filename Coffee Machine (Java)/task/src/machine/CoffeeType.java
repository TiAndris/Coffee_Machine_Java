package machine;

public enum CoffeeType {
    ESPRESSO(250, 0, 16, 4, 1),
    LATTE(350, 75, 20, 7, 1),
    CAPPUCCINO(200, 100, 12, 6, 1);

    private final int water;
    private final int milk;
    private final int coffeeBeans;
    private final int money;
    private final int cups;

    CoffeeType(int water, int milk, int coffeeBeans, int money, int cups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
        this.cups = cups;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getMoney() {
        return money;
    }

    public int getCups() {
        return cups;
    }
}
