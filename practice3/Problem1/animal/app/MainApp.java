package practice3.Problem1.animal.app;


import practice3.Problem1.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Dog d1 = new Dog("Hachiko",3,"Akita");
        Dog d2 = new Dog("Lassie", 4,"Rough Collie");


        d1.eat("Meat");
        System.out.println();
        d2.eat();

        System.out.println();

        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(d1);
        dogs.add(d2);

        for(Dog d : dogs){
            d.makeSound();
            d.getInfo();
            System.out.println();
        }
    }
}
