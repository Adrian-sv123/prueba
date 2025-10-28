package com.adri.project_Vehicles.vehicle_manager;

import java.io.IOException;

import com.adri.project_Vehicles.vehicle_manager.models.Car;
import com.adri.project_Vehicles.vehicle_manager.models.Motorcycle;
import com.adri.project_Vehicles.vehicle_manager.util.VehicleManager;


public class App {
	public static void main(String[] args) throws IOException {

	
		VehicleManager manager = new VehicleManager();

		 Car car1 = new Car("Tesla", "Model 3", 2021, 42000, 4);
		    Motorcycle moto1 = new Motorcycle("Ducati", "Monster 821", 2018, 11500, false);


		    manager.addVehicle(car1);
		    manager.addVehicle(moto1);
		

		String filePath = "Vehicle.json";
		manager.saveToFile(filePath);



	//	System.out.println("===== VEHICLES IN MEMORY =====");
	//	manager.saveToFile(filePath);

	}
}
