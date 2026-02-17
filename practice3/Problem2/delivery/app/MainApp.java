package practice3.Problem2.delivery.app;

import practice3.Problem2.delivery.model.Car;
import practice3.Problem2.delivery.model.Engine;
import practice3.Problem2.delivery.model.Truck;
import practice3.Problem2.delivery.model.Vehicle;
import practice3.Problem2.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 5000, new Engine("v8",220),5);
        Truck t1 = new Truck("Volvo", 10000, new Engine("v12",500), 500);

        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(c1);
        vehicleList.add(t1);

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.printAllVehicles(vehicleList);
        System.out.println();
        deliveryService.calculateAllDeliveries(vehicleList);
        System.out.println();
        deliveryService.calculateTotalCost(vehicleList);
    }


}
