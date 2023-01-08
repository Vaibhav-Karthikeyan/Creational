package com.masai.factory;

public class TataFactory extends VehicleAbstractFactory{
	private String model;
	private int makeYear;
	private String regNo;
	private String[] specialFeatures;
	public TataFactory(String model, int makeYear, String regNo, String[] specialFeatures) {
		super();
		this.model = model;
		this.makeYear = makeYear;
		this.regNo = regNo;
		this.specialFeatures = specialFeatures;
	}
	@Override
	public Vehicle createVehicle() {
		return new Tata(model,makeYear,regNo,specialFeatures);
	}
	
	
}
