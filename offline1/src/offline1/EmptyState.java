package offline1;

public class EmptyState implements State {
    VendingMachine machine;

    public EmptyState(VendingMachine machine) {

        this.machine =  machine;

    }

    public void insertCoin(){

        System.out.println("Can not process the request");

    }

    public void pressButton(){

    	System.out.println("Invalid Action");

    }

    public void dispense() {

    	System.out.println("Invalid Action");

    }
	
}
