package offline1;

public class DemoState {
    public DemoState() {

    }

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();

        machine.reFill(3); // 

        //First despense 

       
        machine.insertCoin();

        machine.pressButton();


        //Second Test 

       
        machine.insertCoin();
        machine.insertCoin();

        machine.pressButton();

   

        //Test THree 

        machine.pressButton();

    
        //Test Four 

     

       machine.insertCoin();

  

    }

	
}
