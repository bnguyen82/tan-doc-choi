package builder.test;

import java.util.HashMap;
import java.util.Map;

import builder.design.VehicleDesignForm;


public class BuilderTest {
	public static void main(String[] args) {
		VehicleDesignForm design = new VehicleDesignForm();
		Map<String, Integer> details = new HashMap<String, Integer>();
		details.put("Wheel", 4);
		design.setVehicleType("car");
		design.setComponentsInfo(details);
		Director director = new Director();
		director.createVehicle(design);
		
	}
}
