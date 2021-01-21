
public class Colleague2 extends Colleague{
	public Colleague2(Mediator mediator,String name)
	{
	super(mediator);
		this.name = name;
	}
	 
	public void Send(String msg,char first)
	{
		mediator.Send(this,msg,first);
	}
	 
	public void Notify(String msg)
	{
		System.out.println("C2 gets message: "+ msg);
	}
	
	

}
