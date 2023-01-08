package com.masai.factory;

public class Factory {

	public static void main(String[] args) {
		Vehicle vehicle=VehicleFactory.getVehicle("Maruti", "xl6", 2022, "1001",new String[]{"Fast" , "Efficient"});
		System.out.println(vehicle);
		BMWFactory bmw=new BMWFactory("B#",2022,"10001",null);
		Vehicle vehicle2=VehicleFactoryAbstract.getVehicle(bmw);
		if(vehicle2 instanceof Maruti) {
			System.out.println(vehicle2);
			System.out.println("Its a maruti");
		}else if(vehicle2 instanceof BMW) {
			System.out.println(vehicle2);
			System.out.println("Its a bmw");
		}else if(vehicle2 instanceof Tata) {
			System.out.println(vehicle2);
			System.out.println("Its a tata");
		}
	}
}
