package lab1.Problem3;

public class Temperature {
    private double temperature;
    private char scale;

    Temperature(double temperature){
        this.temperature = temperature;
        this.scale = 'C';
    }

    Temperature(char scale){
        this.scale = scale;
        this.temperature = 0;
    }

    Temperature(double temperature, char scale){
        this.scale = scale;
        this.temperature = temperature;
    }

    Temperature(){
        this.temperature = 0;
        this.scale = 'C';
    }


    public double toCelsius(){
        if(scale == 'F'){
            return 5 * (temperature - 32) / 9;
        }
        return temperature;
    }

    public double toFahrenheit(){
        if(scale == 'C'){
            return (9 * (temperature / 5)) + 32;
        }
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setScaleAndTemperature(double temperature, char scale){
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getTemperature(){
        return temperature;
    }

    public char getScale(){
        return scale;
    }

}
