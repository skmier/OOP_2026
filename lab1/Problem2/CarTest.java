package lab1.Problem2;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car(AutoBody.SEDAN, 305, "BMW M5", 2026);
        Car toyotaTundra = new Car(AutoBody.PICKUP, 220, "Toyota Tundra", 2024);

        bmw.displayMachineCharacteristics(bmw.getModel(), bmw.getYear());
        System.out.println(bmw.getModel() + "`s vin number is " + bmw.getVinNumber());

        toyotaTundra.displayMachineCharacteristics(toyotaTundra.getModel(), toyotaTundra.getYear(), toyotaTundra.getSpeed());
        toyotaTundra.timeTraveled(bmw.getSpeed(), 400, bmw.getModel());
    }
}
