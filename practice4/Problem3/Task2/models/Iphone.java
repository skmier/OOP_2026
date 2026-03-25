package practice4.Problem3.Task2.models;

import practice4.Problem3.Task2.contracts.SellableAndPluggable;

public class Iphone implements SellableAndPluggable {
    private String model;
    private double price;
    private String chargerType;

    public Iphone(String model, double price,String chargerType){
        this.model = model;
        this.price = price;
        this.chargerType = chargerType;
    }



    @Override
    public void plugIntoOutlet() {
        System.out.println("Iphone: " + this.model + " is connected to the power outlet via " + this.chargerType );
    }

    @Override
    public void sellPrice(double price) {
        System.out.println("Iphone: " + this.model + " costs: " + price);
    }

    @Override
    public void showPhoneDescription() {
        System.out.println("Iphone: " + this.model + " costs " + this.price + " charger type: " + this.chargerType);
    }


    public String getChargerType() {
        return chargerType;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
