
public class ConcreteMediator extends Mediator
{
	private Friend1 friend1;
	private Friend2 friend2;
	private Colleague1 colleague1;
	private Colleague2 colleague2;
	
	
	public void setFriend1(Friend1 friend1) {
			this.friend1 = friend1;
		}
		 
	public void setFriend2(Friend2 friend2) {
			this.friend2 = friend2;
		}
	public void setColleague1(Colleague c1) {
		this.colleague1 = (Colleague1) c1;
	}
	 
	public void setColleague2(Colleague c2) {
		this.colleague2 = (Colleague2) c2;
	}
		 
		
		@Override
		public void Send(Friend frd,String msg,char first)
		{
		//In all cases, boss is notified
		if (frd == friend1)
		{
			if(first=='A') {
				friend2.Notify(msg);
				colleague1.Notify(msg);
				colleague2.Notify(msg);
			}
			if(first=='C') {
				colleague1.Notify(msg);
				colleague2.Notify(msg);
			}
			if(first=='F') {
				friend2.Notify(msg);
			}
			
		}
		if (frd == friend2)
		{
			if(first=='A') {
				friend1.Notify(msg);
				colleague1.Notify(msg);
				colleague2.Notify(msg);
			}
			if(first=='C') {
				colleague1.Notify(msg);
				colleague2.Notify(msg);
			}
			if(first=='F') {
				friend1.Notify(msg);
			}
			
		}		
		}
		
		@Override
		public void Send(Colleague col,String msg,char first)
		{
		//In all cases, boss is notified
		if (col == colleague1)
		{
			if(first=='A') {
				colleague2.Notify(msg);
				friend1.Notify(msg);
				friend2.Notify(msg);
			}
			if(first=='C') {
				colleague2.Notify(msg);
			}
			if(first=='F') {
				friend2.Notify(msg);
				friend2.Notify(msg);
			}
			
		}
		
		if (col == colleague1)
		{
			if(first=='A') {
				colleague2.Notify(msg);
				friend1.Notify(msg);
				friend2.Notify(msg);
			}
			if(first=='C') {
				colleague2.Notify(msg);
			}
			if(first=='F') {
				friend2.Notify(msg);
				friend2.Notify(msg);
			}
			
		}
		
		
		}
}




