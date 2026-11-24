package vending;

public class SnackDispensePepsi extends SnackDispenseHandler {
    public SnackDispensePepsi(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void dispense(String name) {
        if(name.equals("Pepsi")) {
            vendingMachine.getSnacks().get("Pepsi").removeOne();
            System.out.println("Pepsi dispensed");
            return;
        }
        passNext(name);
    }
}
