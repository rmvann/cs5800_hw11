package vending;

public abstract class SnackDispenseHandler {
    protected SnackDispenseHandler next;
    protected VendingMachine vendingMachine;

    public SnackDispenseHandler(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public SnackDispenseHandler setNext (SnackDispenseHandler next) {
        this.next = next;
        return next;
    }

    protected void passNext(String name){
        if(next == null){
            System.err.println("Snack not found in machine");
            return;
        }
        next.dispense(name);
    }

    public abstract void dispense(String name);
}
