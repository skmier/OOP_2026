package practice3.Problem1.animal.model;

public abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void getInfo(){
        System.out.println("Hi! My name is " + this.name + " and I`m " + this.age + " y.o");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
