package vending;

public class SnackDispenseSnickers extends SnackDispenseHandler {
    public SnackDispenseSnickers(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void dispense(String name) {
        if(name.equals("Snickers")) {
            vendingMachine.getSnacks().get("Snickers").removeOne();
            System.out.println("Snickers dispensed");
            return;
        }
        passNext(name);
    }
}
