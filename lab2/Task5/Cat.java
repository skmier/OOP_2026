package lab2.Task5;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name,age);
    }

    @Override
    public String getSoundO() {
        return "Meow meow";
    }
}
