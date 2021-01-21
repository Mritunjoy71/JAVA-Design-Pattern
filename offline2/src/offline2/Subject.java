package offline2;
import java.util.ArrayList;

public class Subject implements ISubject{
	ArrayList<Observer> observerList = new ArrayList<Observer>();
	private String message;
	public String getmessage()
	{
		return message;
	}
	public void setmessage(String message)
	{
		this.message=message;
		//flag value changed .So notify observer(s)
		notifyObservers();
	}
	@Override
	public void subscribe(Observer o)
	{
		observerList.add(o);
	}
	@Override
	public void unsubscribe(Observer o)
	{
		observerList.remove(o);
	}
	@Override
	public void notifyObservers()
	{
		for(int i=0;i<observerList.size();i++)
			{
				observerList.get(i).update(i+1,getmessage());
			}
	}

}
