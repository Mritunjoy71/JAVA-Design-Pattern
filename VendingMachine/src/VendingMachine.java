
// This is like Context
public class VendingMachine implements VendingMachineState
{

	 private VendingMachineState vendingMachineState;
	 private int capacity=0;
	 int price =35;
	 int amnt;
	
	 public VendingMachine()
	 {
		 vendingMachineState = new EmptyState();
	 }
    public void reFill(int count) {

        capacity += count;
        if(capacity>0)
        	vendingMachineState = new NoMoneyState();

    }
    
    public boolean isEmpty(){

        if(capacity<=0)
            return true;
        else
            return false;
    }
    
	
	 public VendingMachineState getVendingMachineState()
	 {
		 return vendingMachineState;
	 }
	
	 public void setVendingMachineState( VendingMachineState vendingMachineState )
	 {
		 this.vendingMachineState = vendingMachineState;
	 }
	
	 @Override
	 public void selectProductAndInsertMoney( int amount, String productName )
	 {
		 amnt=amount;
	 
		 vendingMachineState.selectProductAndInsertMoney(amount, productName);
		 
	 
		 if( vendingMachineState instanceof NoMoneyState )
		 {
			 VendingMachineState hasMoneyState = new HasMoneyState();
			 setVendingMachineState(hasMoneyState);
			 System.out.println("VendingMachine internal state has been moved to : "
		                + vendingMachineState.getClass().getName());
		 }
			 
		 
	
	 }
	
	 @Override
	 public void dispenseProduct()
	 {
		 vendingMachineState.dispenseProduct();
		 if(vendingMachineState instanceof EmptyState) {
			 System.out.println("Your return money is "+amnt);
			 
		 }
		 
		 else if( vendingMachineState instanceof HasMoneyState )
		 {
			 capacity--;
			 if(amnt>price) {
				 System.out.println("Your return money is "+(amnt-price));
				 
			 }
			 if(isEmpty()) {
				 VendingMachineState emptyState = new EmptyState();
				 setVendingMachineState(emptyState);
				 System.out.println("VendingMachine internal state has been moved to : "
			                + vendingMachineState.getClass().getName());
				 
			 }
			 else{
				 VendingMachineState nomoneyState = new NoMoneyState();
				 setVendingMachineState(nomoneyState);
				 System.out.println("VendingMachine internal state has been moved to : "
			                + vendingMachineState.getClass().getName());
				 
			 }
				 
		 }
		 amnt=0;
		
	
	 }

}