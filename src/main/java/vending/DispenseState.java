package vending;

public class DispenseState extends StateOfVendingMachine{
    public DispenseState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public Snack selectSnack(String name) {
        if(vendingMachine.getSnacks().containsKey(name) && vendingMachine.getSnacks().get(name).getQuantity()>0){
            System.out.printf("%s selected%n", name);
            Snack snack = vendingMachine.getSnacks().get(name);
            if(vendingMachine.getCashInMachine() >= snack.getCost()){
                return snack;
            }

            System.out.println("Please insert more money");
            vendingMachine.setState(vendingMachine.moneyStateInstance());
            return snack;
        }
        else{
            System.err.printf("Not enough %s in machine%n", name);
            vendingMachine.setState(vendingMachine.idleStateInstance());
            return null;
        }
    }

    @Override
    public void insertMoney(double amount) {
        System.err.println("Sufficient amount already inserted");
    }

    @Override
    public void dispenseSnack() {
        vendingMachine.getDispenseHandler().dispense(vendingMachine.getSelectedSnack().getName());
        vendingMachine.addCash(-vendingMachine.getSelectedSnack().getCost());
        vendingMachine.returnMoney();
        vendingMachine.setState(vendingMachine.idleStateInstance());
    }
}
