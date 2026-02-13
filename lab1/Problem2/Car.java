package lab1.Problem2;

public class Car {
    private AutoBody autoBody;
    private double speed;
    private String model;
    private final int year;
    private String vinNumber;
    public static int countCars;

    {
        countCars++;
        this.vinNumber = countCars + "";
    }

    Car(AutoBody autoBody, double speed, String model , int year){
        this.year = year;
        this.model = model;
        this.autoBody = autoBody;
        this.speed = speed;
    }

    public void timeTraveled(double speed, double pathTraveled){
        System.out.println("Car traveled " + ( pathTraveled / speed) + " hours");
    }

    public void timeTraveled(double speed, double pathTraveled, String model){
        System.out.println(model + " traveled " + ( pathTraveled / speed) + " hours");
    }

    public void displayMachineCharacteristics(String model, int year){
        System.out.println("Car: " + model + "was produced in " + year);
    }

    public void displayMachineCharacteristics(String model, int year, double speed){
        System.out.println("Car: " + model + " was produced in " + year + " and has " + speed + " KM/H speed");
    }

    public AutoBody getAutoBody() {
        return autoBody;
    }

    public double getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getVinNumber() {
        return vinNumber;
    }

}
