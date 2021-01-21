
public abstract class Abstractdecorator extends Jersy{
	public Jersy jer;
	public void setthejersy(Jersy j)
	{
		jer=j;
	}
	
	public int price(String jersyname) {
		return jer.price(jersyname);
	
	
	}
	

}
