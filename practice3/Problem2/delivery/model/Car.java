package practice3.Problem2.delivery.model;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats){
        super(model,baseCost,engine);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return getBaseCost() * numberOfSeats;
    }

    @Override
    public String getVehicleInfo() {
        return "Model : " + getModel() + " Base cost " + getBaseCost() + " Engine " + getEngine() + " Number Of seats : " + numberOfSeats;
    }

    public double calculateDeliveryCost(double extraweight) {
        return getBaseCost() * numberOfSeats + extraweight;
    }
}
