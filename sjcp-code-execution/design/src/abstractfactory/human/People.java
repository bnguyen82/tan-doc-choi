package abstractfactory.human;

import java.util.Locale;

public class People {
	private Locale local;
	private int id;
	protected static int idCount;
	protected int type;
	public People(String local){
		this.local = new Locale(local);
		this.id = getIdCount()+1;
		incrementId();
	}
	public static synchronized int getIdCount() {
		return idCount;
	}

	public static synchronized void incrementId() {
		idCount++ ;
	}

	public void setLocal(Locale local) {
		this.local = local;
	}

	public Locale getLocal() {
		return local;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
