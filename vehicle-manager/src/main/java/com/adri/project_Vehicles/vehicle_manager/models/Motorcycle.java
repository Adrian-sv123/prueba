package com.adri.project_Vehicles.vehicle_manager.models;

import com.adri.project_Vehicles.vehicle_manager.interfaces.Vehicle;


public class Motorcycle implements Vehicle {

    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean hasSidecar;

    // --- Constructor ---
    public Motorcycle(String brand, String model, int year, double price, boolean hasSidecar) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.hasSidecar = hasSidecar;
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

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public void showInfo() {
        System.out.println("🏍️ [Motorcycle]");
        System.out.println("  Brand: " + brand);
        System.out.println("  Model: " + model);
        System.out.println("  Year: " + year);
        System.out.println("  Price: $" + price);
        System.out.println("  Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("  Classic: " + (isClassic() ? "Yes" : "No"));
        System.out.println("-------------------------------------------");
    }
}
