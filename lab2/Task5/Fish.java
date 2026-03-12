package lab2.Task5;

public class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSoundO() {
        return "bluq bluq";
    }
}
