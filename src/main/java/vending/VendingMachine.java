package vending;

import java.util.Map;
import java.util.HashMap;

public class VendingMachine {
    private StateOfVendingMachine state;
    private Map<String, Snack> snacks;
    private double cashInMachine;
    private Snack selectedSnack = null;

    private final StateOfVendingMachine idleState = new IdleState(this);
    private final StateOfVendingMachine moneyState = new ReceiveMoneyState(this);
    private final StateOfVendingMachine dispenseState = new DispenseState(this);

    public VendingMachine(){
        setState(idleState);
        snacks = new HashMap<>();
        cashInMachine = 0.0;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void selectSnack(String name){
        selectedSnack = state.selectSnack(name);
    }

    public void insertMoney(double amount){
        state.insertMoney(amount);
    }

    public void dispenseSnack(){
        state.dispenseSnack();
    }

    public void returnMoney(){
        System.out.printf("Returning $%d%n", selectedSnack.getQuantity());
        cashInMachine = 0;
        selectedSnack = null;
        setState(idleState);
    }

    public void addSnack(Snack snack){
        snacks.put(snack.getName(), snack);
    }

    public Map<String, Snack> getSnacks(){
        return snacks;
    }

    public StateOfVendingMachine idleStateInstance(){
        return idleState;
    }

    public StateOfVendingMachine moneyStateInstance(){
        return moneyState;
    }

    public StateOfVendingMachine dispenseStateInstance(){
        return dispenseState;
    }

    public void addCash(double amount){
        cashInMachine += amount;
    }

    public Snack getSelectedSnack(){
        return selectedSnack;
    }

    public double getCashInMachine(){
        return cashInMachine;
    }
}
