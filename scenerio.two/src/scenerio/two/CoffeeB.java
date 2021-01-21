package scenerio.two;

public class CoffeeB implements Coffee{
	@Override
	public String name()
	{
		return "Coffee Shake";
	}
	public String coffee_ingridients() {
		return  "Ingridients:milk,caffein.(sugar free)";
		
	}
	public float price() {
		return 30.0f;
	}

}
