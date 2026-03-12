package lab2.Task4;

public class Series extends Circuit{
    private Circuit v1;
    private Circuit v2;
    private Resistor total;

    public Series(Circuit v1, Circuit v2) {
        this.v1 = v1;
        this.v2 = v2;
        total = new Resistor(v1.getResistance() + v2.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return total.getPotentialDiff();
    }

    @Override
    public double getResistance() {
        return total.getResistance();
    }

    @Override
    public void applyPotentialDiff(double V) {
        total.applyPotentialDiff(V);
    }
}
