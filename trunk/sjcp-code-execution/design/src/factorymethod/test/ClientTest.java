package factorymethod.test;

public class ClientTest {	
	public static void main(String[] args) {
		Business bus = new Business();
		bus.displayAnimalCases(args);
	}
}
