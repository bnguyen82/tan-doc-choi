package builder.test;

import builder.design.VehicleDesignForm;
import builder.factory.BuilderFactory;
import builder.products.Vehicle;

public class Director {
	public void createVehicle(VehicleDesignForm design){
		BuilderFactory builder = BuilderFactory.getFactory(design);
		Vehicle vehicle = builder.getVehicle();
		vehicle.display();
		
	}
}
