package midterm;

import java.util.Vector;

public class DuplicateCounter {

    public Vector<Pair> calculateDuplicate(int [] array){

        Vector<Pair> result = new Vector<>();

        for (int current : array) {
            boolean flag = false;
            for (Pair p : result) {
                if (current == p.element) {
                    p.cnt++;
                    flag = true;
                    break;
                }
            }

            if (!flag){
                Pair p = new Pair();
                p.element = current;
                p.cnt++;
                result.add(p);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DuplicateCounter main = new DuplicateCounter();
        int[] test = {1,1,1,3,2,3,4,5};
        Vector<Pair> res = main.calculateDuplicate(test);

        for (Pair p :res){
            System.out.println(p);
        }
    }
}
