package scenerio.two;

public class CoffeeA implements Coffee{
	@Override
	public String name()
	{
		return "Coffee Master";
	}
	public String coffee_ingridients() {
		return  "Ingridients:milk,caffein and sugar";
		
	}

	public float price() {
		return 40.0f;
	}
	

}
