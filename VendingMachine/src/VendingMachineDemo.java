
public class VendingMachineDemo
{

 public static void main( String[] args )
 {

 /*
 * Initially Vending Machine will be 'noMoneyState'
 */
 VendingMachine vendingMachine = new VendingMachine();
 vendingMachine.reFill(2);

 System.out.println("Current VendingMachine State : "
                + vendingMachine.getVendingMachineState().getClass().getName()+"\n");

 vendingMachine.dispenseProduct();
 vendingMachine.selectProductAndInsertMoney(100, "Pepsi");

 /*
 * Money has been inserted so vending Machine changed the
 * internal state to 'hasMoneyState'
 */

 System.out.println("\nCurrent VendingMachine State : "
                + vendingMachine.getVendingMachineState().getClass().getName()+"\n");

 vendingMachine.selectProductAndInsertMoney(100, "Fanta");
 vendingMachine.dispenseProduct();

 /*
 * Product has been dispensed so vending Machine changed the
 * internal state to 'NoMoneyState'
 */
 
 System.out.println("\nCurrent VendingMachine State : "
                + vendingMachine.getVendingMachineState().getClass().getName());
 
 vendingMachine.selectProductAndInsertMoney(100, "Fanta");
 vendingMachine.dispenseProduct();
 
 System.out.println("\nCurrent VendingMachine State : "
         + vendingMachine.getVendingMachineState().getClass().getName());
 
 vendingMachine.selectProductAndInsertMoney(100, "Fanta");
 vendingMachine.dispenseProduct();
 
 vendingMachine.dispenseProduct();
 

 }

}