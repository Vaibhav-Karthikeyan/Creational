package com.masai.factory;

public class MarutiFactory extends VehicleAbstractFactory{
	private String model;
	private int makeYear;
	private String regNo;
	private String[] specialFeatures;
	public MarutiFactory(String model, int makeYear, String regNo, String[] specialFeatures) {
		super();
		this.model = model;
		this.makeYear = makeYear;
		this.regNo = regNo;
		this.specialFeatures = specialFeatures;
	}
	@Override
	public Vehicle createVehicle() {
		return new Maruti(model,makeYear,regNo,specialFeatures);
	}
}
