package lab1.Problem1;

public class Data {
    private double maximum = 0;
    private double sum;
    private int count;

    public void addValue(int value){
        count++;
        sum += value;
        if(value > maximum){
            maximum = value;
        }
    }

    public Double avg(){
        if(count == 0 || sum == 0){
            return 0.0;
        }
        return sum / count;
    }

    public Double getMax(){
        if(count == 0){
            return 0.0;
        }
        return maximum;
    }
}
