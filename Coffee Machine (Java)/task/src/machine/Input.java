package machine;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    calculate start = new calculate();

    boolean programRunning = true;

    public void userInput() {
        while (programRunning) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            if (input.equals("buy")) {
                buy();
                System.out.println();
            } else if (input.equals("fill")) {
                fill();
                System.out.println();
            } else if (input.equals("take")) {
                take();
                System.out.println();
            } else if (input.equals("remaining")) {
                start.coffeeMachineHas();
                System.out.println();
            } else if (input.equals("exit")) {
                programRunning = false;
            }
        }
    }

    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String inputBuy = scanner.nextLine();
        if (inputBuy.equals("1")) {
            start.calc(CoffeeType.ESPRESSO);
        } else if (inputBuy.equals("2")) {
            start.calc(CoffeeType.LATTE);
        } else if (inputBuy.equals("3")) {
            start.calc(CoffeeType.CAPPUCCINO);
        } else if (inputBuy.equals("back")) {
            programRunning = true;
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:  ");
        int addCups = scanner.nextInt();
        start.add(addWater, addMilk, addBeans, addCups);
    }

    public void take() {
        start.take();
    }
}