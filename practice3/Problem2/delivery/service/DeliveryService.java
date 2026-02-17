package practice3.Problem2.delivery.service;

import practice3.Problem2.delivery.model.Vehicle;

import java.util.List;

public class DeliveryService {

    public void printAllVehicles(List<Vehicle> vehicles){
        for(Vehicle v : vehicles){
            System.out.println(v.getVehicleInfo());
        }
    }

    public void calculateAllDeliveries(List<Vehicle> vehicles){
        for(Vehicle v : vehicles){
            System.out.println(v.calculateDeliveryCost());
        }
    }


    public void calculateTotalCost(List<Vehicle> vehicles){
        double total = 0;
        for(Vehicle v : vehicles){
            total += v.calculateDeliveryCost();
        }
        System.out.println("Total coast: "+ total);
    }
}
