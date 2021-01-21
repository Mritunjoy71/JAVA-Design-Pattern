package scenerio.two;

public class CoffeeFactory {
	public static CoffeeFactory instance =new CoffeeFactory();
	private CoffeeFactory()
	{
		
	}
	public static CoffeeFactory getinstance()
	{
		return instance;
	}
	public Coffee getCoffee(String coffeeType){
	      if(coffeeType == null){
	         return null;
	      }		
	      if(coffeeType.equalsIgnoreCase("COFFEEA")){
	         return new CoffeeA();	         
	      } else if(coffeeType.equalsIgnoreCase("COFFEEB")){
	         return new CoffeeB();
	         
	      } else if(coffeeType.equalsIgnoreCase("COFFEEC")){
	         return new CoffeeC();
	      }
	      
	      return null;
	   }

}
