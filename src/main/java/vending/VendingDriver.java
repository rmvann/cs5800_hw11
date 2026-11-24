package vending;

public class VendingDriver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addSnack(new Snack("Coke", 4, 1.79));
        machine.addSnack(new Snack("Pepsi", 2, 1.49));
        machine.addSnack(new Snack("Cheetos", 3, 3.97));
        machine.addSnack(new Snack("Doritos", 3, 3.97));
        machine.addSnack(new Snack("KitKat", 3, 1.25));
        machine.addSnack(new Snack("Snickers", 1, 1.55));

        machine.selectSnack("Cheetos");
        machine.insertMoney(4.00);
        machine.dispenseSnack();
        machine.selectSnack("Snickers");
        machine.insertMoney(2.00);
        machine.dispenseSnack();
        machine.selectSnack("Snickers");
        machine.insertMoney(2.00);
    }
}
