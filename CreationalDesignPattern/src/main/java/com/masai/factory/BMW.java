package com.masai.factory;

public class BMW extends Vehicle{
	private String model;
	private int makeYear;
	private String regNo;
	private String[] specialFeatures;
	public BMW(String model, int makeYear, String regNo, String[] specialFeatures) {
		super();
		this.model = model;
		this.makeYear = makeYear;
		this.regNo = regNo;
		this.specialFeatures = specialFeatures;
	}
	public String getModel() {
		return model;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public String getRegNo() {
		return regNo;
	}
	public String[] getSpecialFeatures() {
		return specialFeatures;
	}
	
}
