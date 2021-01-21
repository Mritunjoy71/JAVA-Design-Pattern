
public class ConcreteJersy extends Jersy {

	@Override
	public int price(String jersy) {
		if(jersy =="home")
			return 150;
		else if(jersy =="away")
			return 120;
		else if(jersy =="third")
			return 100;
		return 0;
	}

	

}
