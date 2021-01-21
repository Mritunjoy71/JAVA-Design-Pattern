
public class Friend1 extends Friend {
	public Friend1(Mediator mediator,String name)
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
		System.out.println("F1 gets message: "+ msg);
	}
	
	

}
