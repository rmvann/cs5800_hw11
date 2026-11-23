package vending;

public abstract class StateOfVendingMachine {
    protected VendingMachine vendingMachine;

    public StateOfVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract Snack selectSnack(String name);

    public abstract void insertMoney();

    public abstract void dispenseSnack();
}
