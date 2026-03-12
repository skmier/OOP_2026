package lab2.Task5;

public abstract class Person {
    private String name;
    private int age;
    private Animal animal;

    public Person(String name, int age, Animal animal){
        this.age = age;
        this.animal = animal;
        this.name = name;
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }


    public void retrievePetFrom(Person b){
        if(b.hasPet()){
            this.assignPet(b.animal);
            b.removePet();
        }
    }

    public void leavePetWith(Person b){
        if(!(this.hasPet())){
            System.out.println(name + " does not have any pet");
            return;
        }
        if (this.animal instanceof Dog && b instanceof PhDStudent){
            System.out.println(b.name + " can`t take care the dog");
        }else{
            Animal temp = this.animal;
            this.removePet();
            b.assignPet(temp);
            System.out.println(this.name + " left pet to " + b.name);
        }
    }

    public void assignPet(Animal pet){
        this.animal = pet;
    }

    public void removePet(){
        this.animal = null;
    }

    public boolean hasPet(){
        return this.animal != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return "Name: " +  name + " age: " + age + " pet: " + this.animal;
    }

    public String getName() {
        return name;
    }
}
