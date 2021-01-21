
public class Colleague1 extends Colleague{
	public Colleague1(Mediator mediator,String name)
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
		System.out.println("c1 gets message: "+ msg);
	}
	
	

}
