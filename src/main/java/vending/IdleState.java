package vending;

public class IdleState extends StateOfVendingMachine{
    public IdleState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public Snack selectSnack(String name) {
        if(vendingMachine.getSnacks().containsKey(name)){
            vendingMachine.setState(vendingMachine.moneyStateInstance());
            System.out.printf("%s selected%n", name);
            return vendingMachine.getSnacks().get(name);
        }
        else{
            System.err.printf("Not enough %s in machine%n", name);
            return null;
        }
    }

    @Override
    public void insertMoney(double amount) {
        System.err.println("No snack selected");
    }

    @Override
    public void dispenseSnack() {
        System.err.println("No snack selected");
    }
}
