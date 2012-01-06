package builder.products;

import builder.components.chairs.Chair;
import builder.components.lights.Light;
import builder.components.wheels.Wheel;

public abstract class Vehicle {
	protected String type;
	public String getType() {
		return type;
	}
	public Wheel[] getWheels() {
		return wheels;
	}
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	public Light[] getLights() {
		return lights;
	}
	public void setLights(Light[] lights) {
		this.lights = lights;
	}
	public Chair[] getChairs() {
		return chairs;
	}
	public void setChairs(Chair[] chairs) {
		this.chairs = chairs;
	}
	private Wheel[] wheels;
	private Light[] lights;
	private Chair[] chairs;
	
	public void display(){
		System.out.println(wheels);
		System.out.println(lights);
		System.out.println(chairs);
	}
	
}
