package vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VendingTest {
    private VendingMachine machine;

    @BeforeEach
    void setup() {
        machine = new VendingMachine();
        machine.addSnack(new Snack("Coke", 4, 1.79));
        machine.addSnack(new Snack("Pepsi", 2, 1.49));
        machine.addSnack(new Snack("Cheetos", 3, 3.97));
        machine.addSnack(new Snack("Doritos", 3, 3.97));
        machine.addSnack(new Snack("KitKat", 3, 1.25));
        machine.addSnack(new Snack("Snickers", 1, 1.55));
    }

    @Test
    public void testSelect() {
        machine.selectSnack("Coke");
        assertEquals("Coke", machine.getSelectedSnack().getName());
    }

    @Test
    public void testSelectInvalid() {
        machine.selectSnack("Dr. Pepper");
        assertEquals(machine.idleStateInstance(), machine.getState());
    }

    @Test
    public void testInsufficientMoney() {
        machine.selectSnack("Pepsi");
        machine.insertMoney(1.00);
        assertEquals(machine.moneyStateInstance(), machine.getState());
    }

    @Test
    public void testSufficientMoney() {
        machine.selectSnack("Pepsi");
        machine.insertMoney(1.49);
        assertEquals(machine.dispenseStateInstance(), machine.getState());
    }

    @Test
    public void testDispense(){
        machine.selectSnack("KitKat");
        machine.insertMoney(2.00);
        machine.dispenseSnack();
        assertEquals(machine.idleStateInstance(), machine.getState());
        assertEquals(0, machine.getCashInMachine());
    }
}
