package lab2.Task5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return " pet`s name: " + name + " age: " + age;
    }

    public abstract String getSoundO();
}
