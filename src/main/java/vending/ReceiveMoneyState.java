package vending;

public class ReceiveMoneyState extends StateOfVendingMachine{
    public ReceiveMoneyState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public Snack selectSnack(String name) {
        if(vendingMachine.getSnacks().containsKey(name)){
            System.out.printf("%s selected%n", name);
            return vendingMachine.getSnacks().get(name);
        }
        else{
            System.err.printf("Not enough %s in machine%n", name);
            vendingMachine.setState(vendingMachine.idleStateInstance());
            return null;
        }
    }

    @Override
    public void insertMoney(double amount) {
        vendingMachine.addCash(amount);
        double cost = vendingMachine.getSelectedSnack().getCost();
        if (vendingMachine.getCashInMachine() >= cost){
            vendingMachine.setState(vendingMachine.dispenseStateInstance());
            System.out.println("Sufficient money inserted");
        }
        else{
            System.out.println("Not enough money inserted");
        }
    }

    @Override
    public void dispenseSnack() {
        System.err.println("Please insert money");
    }

}
