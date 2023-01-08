package com.masai.factory;


public class VehicleFactory {
	public static Vehicle getVehicle(String company,String model, int makeYear, String regNo, String[] specialFeatures) {
		if("Maruti".equalsIgnoreCase(company))
			return new Maruti(model,makeYear,regNo,specialFeatures);
		else if("BMW".equalsIgnoreCase(company))
			return new BMW(model,makeYear,regNo,specialFeatures);
		else if("Tata".equalsIgnoreCase(company))
			return new Tata(model,makeYear,regNo,specialFeatures);
		else
			return null;
	}
}
