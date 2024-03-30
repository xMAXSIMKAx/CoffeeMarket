package App.Product;

public class Latte implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Your Late, welcome to the MarketCoffee");
    }
}
