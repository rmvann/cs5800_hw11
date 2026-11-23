package vending;

public class Snack {
    private final String name;
    private int quantity;
    private final double cost;

    public Snack(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public boolean removeOne(){
        if (quantity <= 0){
            System.err.println("None left");
            return false;
        }
        quantity -= 1;
        return true;
    }
}
