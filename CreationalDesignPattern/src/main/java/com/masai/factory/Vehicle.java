package com.masai.factory;

public abstract class Vehicle {
	public abstract String getModel();
	public abstract String getRegNo();
	public abstract String[] getSpecialFeatures();
	public abstract int getMakeYear();
	
	public String toString() {
		return "model="+getModel()+", RegNo="+getRegNo()+", makeyear="+getMakeYear()+"special features="+getSpecialFeatures();
	}
}
