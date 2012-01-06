package builder.factory;

import builder.components.wheels.CarWheel;
import builder.components.wheels.Wheel;
import builder.products.Car;
import builder.products.Vehicle;

public class CarBuilderFactory extends BuilderFactory {

	public CarBuilderFactory() {
		factoryType = "Car";
		vehicle = new Car() ;
	}
	@Override
	public void assemblyChairs() {
		int numChairs = designForm.getComponentsInfo().get(factoryType);
		Wheel[] wheels = new Wheel[numChairs];
		for (int i = 0; i < numChairs; i++) {
			wheels[i] = new CarWheel();
		}
		vehicle.setWheels(wheels);
	}

	@Override
	public void assemblyLights() {
		// TODO Auto-generated method stub

	}

	@Override
	public void assemblyWheels() {
		// TODO Auto-generated method stub

	}

}
