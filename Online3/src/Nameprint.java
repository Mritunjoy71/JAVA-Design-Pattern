public class Nameprint extends Abstractdecorator {
	public int price(String jersyname,String name)
	{
		int p;
		p=super.price(jersyname);
		int l=name.length();
		int pr=p+2*l;
		return pr;
	}

}