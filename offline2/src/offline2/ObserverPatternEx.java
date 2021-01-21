package offline2;

public class ObserverPatternEx {
	public static void main(String[] args) {
		Observer std1 = new Observer();
		Observer std2 = new Observer();
		Subject cr = new Subject();
		cr.subscribe(std1);
		cr.subscribe(std2);
		System.out.println("offline 1");
		cr.setmessage("offline 1 has been uploaded.");
		System.out.println("offline 2");
		cr.setmessage("offline 2 has been uploaded.");
		cr.unsubscribe(std1);
		//No notification this time to o1 .Since it is unregistered.
		System.out.println("offline 3 ");
		cr.setmessage("offline 3 has been uploaded.");
	}

}
