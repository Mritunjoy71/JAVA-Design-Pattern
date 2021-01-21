package offline2;

public interface ISubject {
	void subscribe(Observer o);
	void unsubscribe( Observer o);
	void notifyObservers();

}
