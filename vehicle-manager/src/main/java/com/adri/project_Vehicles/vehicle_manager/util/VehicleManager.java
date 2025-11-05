package com.adri.project_Vehicles.vehicle_manager.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.adri.project_Vehicles.vehicle_manager.interfaces.Vehicle;
import com.google.gson.Gson;

public class VehicleManager {

	
	List<Vehicle> vehicles = new ArrayList<>();
	private static final Logger logger = Logger.getLogger(VehicleManager.class.getName());
	Gson gson = new Gson();
	
	


    public void saveToFile(String path) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            gson.toJson(vehicles, writer);
        }
        logger.info("Vehicles saved to JSON file: " + path);
    }
    
    public void showVehicles() {
    	
    for (Vehicle vehicle : vehicles) {
		System.out.println(vehicle.toString());
	}
    	
    }


    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            logger.warning("Attempted to add a null vehicle.");
            return;
        }
        vehicles.add(vehicle);
        logger.info("Vehicle added: " + vehicle.getBrand() + " " + vehicle.getModel());
    }

}
