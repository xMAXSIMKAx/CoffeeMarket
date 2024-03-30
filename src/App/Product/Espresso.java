package App.Product;

public class Espresso implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Your Espresso, welcome to the MarketCoffee");
    }
}
