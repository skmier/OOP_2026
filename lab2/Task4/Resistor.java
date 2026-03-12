package lab2.Task4;

public class Resistor extends Circuit{
    private double resistance;
    private double potentialDifference;

    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDifference = 0;
    }

    @Override
    public double getPotentialDiff() {
        return this.potentialDifference;
    }

    @Override
    public double getResistance() {
        return this.resistance;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }
}
