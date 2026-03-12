package lab2.Task4;

public class Parallel extends Circuit{
    private Circuit c1;
    private Circuit c2;
    private Resistor total;

    public Parallel(Circuit c1, Circuit c2){
        total = new Resistor((c2.getResistance() * c1.getResistance())/ (c2.getResistance() + c1.getResistance()));
    }

    @Override
    public double getResistance() {
        return total.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return total.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        total.applyPotentialDiff(V);
    }
}
