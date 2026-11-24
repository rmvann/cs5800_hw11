package vending;

public class SnackDispenseDoritos extends SnackDispenseHandler {
    public SnackDispenseDoritos(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void dispense(String name) {
        if(name.equals("Doritos")) {
            vendingMachine.getSnacks().get("Doritos").removeOne();
            System.out.println("Doritos dispensed");
            return;
        }
        passNext(name);
    }
}
