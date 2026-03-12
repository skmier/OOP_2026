package lab2.Task5;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> peopleList = new Vector();


    public void addPerson(Person p){
        peopleList.add(p);
    }

    public void removePerson(Person p){
        if(peopleList.contains(p)){
            peopleList.remove(p);
        }
    }

    public Vector<Person> peopleWithAnimal(){
        Vector<Person> res = new Vector<Person>();
        for (Person p : peopleList){
            if(p.hasPet()){
                res.add(p);
            }
        }
        return res;
    }

    public Vector<Person>  peopleWithoutAnimal(){
        Vector<Person> res = new Vector<Person>();
        for (Person p : peopleList){
            if(!(p.hasPet())){
                res.add(p);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Person Registry:\n");
        for (Person person : peopleList) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}
