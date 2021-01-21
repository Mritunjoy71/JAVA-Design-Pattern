package offline1;

public class CoinInsertedState implements State{
    VendingMachine machine =null;

    public CoinInsertedState(VendingMachine machine) {

        this.machine =  machine;

    }

    public void insertCoin(){

        System.out.println("Coin is already inserted.");

    }

    public void dispense(){

    	System.out.println("Dispense button is not pressed.");

    

    }

    public void pressButton(){

        machine.setMachineState(machine.getDispensingState());

    }

}
