public class Crestprint extends Abstractdecorator {
	public int price(String jersyname,String name)
	{
		int p;
		p=super.price(jersyname);
		int l=0;
		if(name=="fa cup")
			l=8;
		else if(name=="premire league")
			l=10;
		else if(name=="champions league")
			l=20;
		int pr=p+l;
		return pr;
	}

}