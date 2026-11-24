package vending;

public class SnackDispenseKitkat extends SnackDispenseHandler {

    public SnackDispenseKitkat(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void dispense(String name) {
        if(name.equals("KitKat")) {
            vendingMachine.getSnacks().get("KitKat").removeOne();
            System.out.println("KitKat dispensed");
            return;
        }
        passNext(name);
    }
}
