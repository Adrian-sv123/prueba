package com.adri.project_Vehicles.vehicle_manager.interfaces;


public interface Vehicle {
	String getBrand();

	String getModel();

	int getYear();

	double getPrice();

	void showInfo();

	// method default
	default boolean isClassic() {
		return (2025 - getYear()) >= 25;
	}

}
