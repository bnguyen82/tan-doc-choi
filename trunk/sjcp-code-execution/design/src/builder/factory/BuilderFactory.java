package builder.factory;

import builder.design.VehicleDesignForm;
import builder.products.Vehicle;

public abstract class BuilderFactory {
	protected Vehicle vehicle;
	protected VehicleDesignForm designForm;
	protected String factoryType;
	public VehicleDesignForm getDesignForm() {
		return designForm;
	}

	public void setDesignForm(VehicleDesignForm designForm) {
		this.designForm = designForm;
	}

	public static BuilderFactory getFactory(VehicleDesignForm design){
		if ("Car".equalsIgnoreCase(design.getVehicleType())) return new CarBuilderFactory();
		return null;
	}
	
	public abstract void assemblyWheels();
	public abstract void assemblyChairs();
	public abstract void assemblyLights();
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}

}
