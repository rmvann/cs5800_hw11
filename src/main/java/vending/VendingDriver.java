package vending;

public class VendingDriver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addSnack(new Snack("Chocolate Bar", 4, 1.59));
        machine.addSnack(new Snack("Chips", 2, 0.79));
        machine.addSnack(new Snack("Trail Mix", 3, 0.99));

        machine.selectSnack("Chips");
    }
}
