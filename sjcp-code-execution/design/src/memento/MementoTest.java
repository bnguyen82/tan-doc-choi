package memento;

public class MementoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StatusHandler handler = new StatusHandler();
		DataProcess process = new DataProcess(handler.getMemento());
		try {
			process.process("memento.txt");
		}
		catch(Exception e){
			handler.saveMemento(process.getMemento());
		}
	}

}
