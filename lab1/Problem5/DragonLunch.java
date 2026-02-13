package lab1.Problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class DragonLunch {
    private Vector<Person> people = new Vector<>() ;

    public void kidnap(Person p){
        people.add(p);
    }

    public boolean willDragonEatOrNot(){
        List<Person> checker = new ArrayList<>();
        for(Person p : people){
            checker.add(p);
            if(checker.size() >= 2){
                Person last = checker.get(checker.size() - 1);
                Person secondLast = checker.get(checker.size() - 2);
                if(last.getGender() == Gender.GIRL && secondLast.getGender() == Gender.BOY){
                    checker.removeLast();
                    checker.removeLast();
                }
            }
        }
        return !checker.isEmpty();
    }
}
