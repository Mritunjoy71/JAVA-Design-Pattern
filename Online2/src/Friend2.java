
public class Friend2 extends Friend {
	public Friend2(Mediator mediator,String name)
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
		System.out.println("F2 gets message: "+ msg);
	}
	
	

}
