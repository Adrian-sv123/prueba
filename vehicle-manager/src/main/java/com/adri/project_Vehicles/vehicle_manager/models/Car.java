package com.adri.project_Vehicles.vehicle_manager.models;

import com.adri.project_Vehicles.vehicle_manager.interfaces.Vehicle;

public class Car implements Vehicle {

	private String brand;
	private String model;
	private int year;
	private double price;
	private int doors;

	// --- Constructor ---
	public Car(String brand, String model, int year, double price, int doors) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
		this.doors = doors;
	}

	// --- Getters ---
	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public int getYear() {
		return year;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public int getDoors() {
		return doors;
	}

	@Override
	public void showInfo() {
		System.out.println("🚗 [Car]");
		System.out.println("  Brand: " + brand);
		System.out.println("  Model: " + model);
		System.out.println("  Year: " + year);
		System.out.println("  Price: $" + price);
		System.out.println("  Doors: " + doors);
		System.out.println("  Classic: " + (isClassic() ? "Yes" : "No"));
		System.out.println("-------------------------------------------");
	}
}
