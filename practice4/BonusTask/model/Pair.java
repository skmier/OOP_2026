package practice4.BonusTask.model;

import java.util.Comparator;

public class Pair implements Comparable<Pair> {
    private int num;
    private int cnt = 0;

    public Pair(int num){
        this.num = num;
    }


    @Override
    public int compareTo(Pair o) {
        if(this.getCnt() > o.getCnt()){
            return 1;
        } else if (this.getCnt() < o.getCnt()) {
            return -1;
        }
        return 0;
    }

    public int getCnt() {
        return cnt;
    }

    public Pair(int num, int cnt) {
        this.num = num;
        this.cnt = cnt;
    }

    public int getNum() {
        return num;
    }
}
