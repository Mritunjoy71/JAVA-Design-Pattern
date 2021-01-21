package offline1;

public class NoCoinInsertedState implements State {
    VendingMachine machine;

    public NoCoinInsertedState(VendingMachine machine) {

        this.machine =  machine;

    }

    public void insertCoin() {

        if (!machine.isEmpty()) {

            machine.setMachineState(machine.getConinInsertedState());

        }

        else {

        	System.out.println("Can not process request .. Machine is out of stock");

        }

    }

    public void pressButton(){

    	System.out.println("No coin inserted ..");

    }

    public void dispense() {

    	System.out.println("Invalid Operation");

    }

}
