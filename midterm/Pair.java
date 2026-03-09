package midterm;

public class Pair {

    public int element;
    public int cnt;

    @Override
    public boolean equals(Object o){
        return this == o;
    }

    @Override
    public String toString(){
        return element +  " " +cnt;
    }
}
