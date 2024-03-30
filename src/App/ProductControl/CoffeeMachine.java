package App.ProductControl;

import App.Product.Cappuccino;
import App.Product.Coffee;
import App.Product.Espresso;
import App.Product.Latte;

import java.util.Scanner;

public class CoffeeMachine {
    public void CoffeeStarter(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Menu");
        System.out.println("1. Cappuccino");
        System.out.println("2. Espresso");
        System.out.println("3. Latte");
        System.out.println("Choice the drink:");

        int choice = scanner.nextInt();

        while (choice <1 || choice > 3){
            System.out.println("Invalid choice");
            System.out.println("1. Cappuccino");
            System.out.println("2. Espresso");
            System.out.println("3. Latte");
            System.out.println("Choice the drink:");
            choice = scanner.nextInt();
        }
        Coffee coffee = null;
        switch (choice){
            case 1:
                coffee = new Cappuccino();
                break;
            case 2:
                coffee = new Espresso();
                break;
            case 3:
                coffee = new Latte();
                break;

        }
        if (coffee != null){
            coffee.makeCoffee();

        }

        scanner.close();



    }

}
