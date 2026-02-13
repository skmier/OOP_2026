package lab1.Problem3;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(32); //with  1 field
        System.out.println("Scale " + t1.getScale() + " in F " + t1.toFahrenheit());

        Temperature t2 = new Temperature('F');
        System.out.println("Scale " + t2.getScale() + " in C " + t2.toCelsius());

        Temperature t3 = new Temperature(32,'C'); // with 2 fields
        System.out.println("Scale " + t3.getScale() + " in F " + t3.toFahrenheit());

        Temperature t4 = new Temperature(); // without fields
        System.out.println("Scale " + t4.getScale() + " in F " + t4.toFahrenheit());

        t4.setTemperature(32);
        t4.setScale('C');
        System.out.println("Scale " + t4.getScale() + " in F " + t4.toFahrenheit());

        t4.setScaleAndTemperature(50,'F');
        System.out.println("Scale " + t4.getScale() + " in C " + t4.toCelsius());
    }
}
