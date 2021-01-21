package offline1;

public class DispensingState implements State{
    VendingMachine machine ;

    DispensingState(VendingMachine machine) {

        this.machine = machine;

    }

    public void insertCoin() {

    	System.out.println("wait ... previous order is processing");

    }

    public void pressButton(){

    	System.out.println("wait ... previous order is processing");

    }

    public void dispense() {

        machine.setMachineState(machine.getNoCoinInsertedState());

    }

}
