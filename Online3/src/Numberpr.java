
public class Numberpr extends Abstractdecorator {
	public int price(String jersyname,String number)
	{
		int p;
		p=super.price(jersyname);
		int l=number.length();
		int pr=p+3*l;
		return pr;
	}

}
