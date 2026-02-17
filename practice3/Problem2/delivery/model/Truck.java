package practice3.Problem2.delivery.model;

public class Truck extends Vehicle {
    public int maxLoad;

    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return getBaseCost() * maxLoad;
    }

    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return getBaseCost() * maxLoad * distance + fuelPrice;
    }

    @Override
    public String getVehicleInfo() {
        return  "Model : " + getModel() + " Base cost " + getBaseCost() + " Engine " + getEngine() + " Max Load : " + maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}
