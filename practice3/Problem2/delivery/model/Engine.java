package practice3.Problem2.delivery.model;

public class Engine {
    private String type;
    private double horsepower;

    public Engine(String type, double horsepower){
        this.type = type;
        this.horsepower = horsepower;
    }

    public void getEngineInfo(){
        System.out.println(type + " has " + horsepower + " horse power");
    }


    public String getType() {
        return type;
    }

    public double getHorsepower() {
        return horsepower;
    }
}
