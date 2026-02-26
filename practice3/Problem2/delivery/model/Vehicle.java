package practice3.Problem2.delivery.model;

public abstract class Vehicle {
    private String model;
    private double baseCost;
    private Engine engine;

    Vehicle(String model, double baseCost , Engine engine){
        this.baseCost = baseCost;
        this.model = model;
        this.engine = engine;
    }

    public double calculateDeliveryCost(){
        return this.baseCost * 1.2;
    }

    public String getVehicleInfo(){
        return "Model: " + model + " Base cost: " + baseCost + " Engine: " + engine ;
    }

    public String getModel() {
        return model;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public String getEngine(){
        return this.engine.getType()  + " horse power "+ this.engine.getHorsepower();
    }
}
