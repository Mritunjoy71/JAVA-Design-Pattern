public class EmptyState implements VendingMachineState
{

 @Override
 public void selectProductAndInsertMoney( int amount, String productName )
 {
	 System.out.println("The inventory is empty.Try after refill...");

 }

 @Override
 public void dispenseProduct()
 {
 System.out.println("The inventory is empty.Vending Machine can't dispense ...");

 }

}
