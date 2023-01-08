package com.masai.factory;

public class VehicleFactoryAbstract {
	public static Vehicle getVehicle(VehicleAbstractFactory factory) {
		return factory.createVehicle();
	}
}
