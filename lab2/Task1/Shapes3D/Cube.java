package lab2.Task1.Shapes3D;

public class Cube extends Shape3D {
    private double height;

    public Cube(double height){
        this.height = height;
    }

    @Override
    public double volume() {
        return height * height * height;
    }

    @Override
    public double surfaceArea() {
        return 6 * height * height;
    }
}
