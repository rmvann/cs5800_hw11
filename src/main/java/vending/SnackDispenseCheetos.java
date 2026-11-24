package vending;

public class SnackDispenseCheetos extends SnackDispenseHandler {

    public SnackDispenseCheetos(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void dispense(String name) {
        if(name.equals("Cheetos")) {
            vendingMachine.getSnacks().get("Cheetos").removeOne();
            System.out.println("Cheetos dispensed");
            return;
        }
        passNext(name);
    }
}
