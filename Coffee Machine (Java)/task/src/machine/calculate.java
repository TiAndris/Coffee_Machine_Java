package machine;

public class calculate {
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int money = 550;
    int cups = 9;

    public void coffeeMachineHas() {
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + money + " of money");
    }

    public void calc(CoffeeType coffeeType) {
        if (checkAmountOfCoffee(coffeeType)) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= coffeeType.getWater();
            milk -= coffeeType.getMilk();
            coffeeBeans -= coffeeType.getCoffeeBeans();
            money += coffeeType.getMoney();
            cups -= coffeeType.getCups();
        } else {
            whatWeNeed(coffeeType);
        }
    }

    public void add(int addWater, int addMilk, int addBeans, int addCups) {
        water += addWater;
        milk += addMilk;
        coffeeBeans += addBeans;
        cups += addCups;
    }

    public void take() {
        System.out.println();
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public boolean checkAmountOfCoffee(CoffeeType coffeeType) {
        if (water < coffeeType.getWater()) {
            return false;
        } else if (milk < coffeeType.getMilk()) {
            return false;
        } else if (coffeeBeans < coffeeType.getCoffeeBeans()) {
            return false;
        } else if (cups < coffeeType.getCups()) {
            return false;
        } else {
            return true;
        }
    }

    public void whatWeNeed(CoffeeType coffeeType) {
        if (water < coffeeType.getWater()) {
            System.out.println("Sorry, not enough water!");
        }
        if (milk < coffeeType.getMilk()) {
            System.out.println("Sorry, not enough milk!");
        }
        if (coffeeBeans < coffeeType.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (cups < coffeeType.getCups()) {
            System.out.println("Sorry, not enough coffee disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
}