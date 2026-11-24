package vending;

public class SnackDispenseCoke extends SnackDispenseHandler {
    public SnackDispenseCoke(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void dispense(String name) {
        if(name.equals("Coke")) {
            vendingMachine.getSnacks().get("Coke").removeOne();
            System.out.println("Coke dispensed");
            return;
        }
        passNext(name);
    }
}
