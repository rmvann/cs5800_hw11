package vending;

public class VendingMachine {
    private StateOfVendingMachine state;

    public VendingMachine(){
        state = new IdleState(this);
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void selectSnack(){
        return;
    }

    public void insertMoney(){
        return;
    }

    public void dispenseSnack(){
        return;
    }
}
