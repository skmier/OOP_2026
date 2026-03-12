package lab2.Task1.Shapes3D;

public class AppTest {


    public static void main(String[] args) {
        Sphere s1 = new Sphere(4);
        Cube c1 = new Cube(5);
        Cylinder c = new Cylinder(4,5);

        System.out.println("Volumes of Shapes: " );
        System.out.println("Volume of Sphere " + s1.volume());
        System.out.println("Volume of Cube " + c1.volume());
        System.out.println("Volume of Cylinder " + c.volume());

        System.out.println("Surface Area of Shapes: " );
        System.out.println("Surface of Sphere " + s1.surfaceArea());
        System.out.println("Surface of Cube " + c1.surfaceArea());
        System.out.println("Surface of Cylinder " + c.surfaceArea());

    }
}
