package practice4.BonusTask.services;

import practice4.BonusTask.model.Pair;
import practice4.BonusTask.model.Sortable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CountingSortService implements Sortable {
    @Override
    public int[] sort(int[] arr) {
        int[] cnt = new  int[11];
        for(int i : arr){
            cnt[i]++;
        }

        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++){
            if(cnt[i] > 0){
                pairs.add(new Pair(i,cnt[i]));
            }
        }
        Collections.sort(pairs);
        Vector<Integer> res = new Vector<>();
        for(Pair p : pairs){
            for (int i = 0; i < p.getCnt(); i++){
                res.add(p.getNum());
            }
        }
        int[] sortedArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            sortedArr[i] = res.get(i);
        }

        return sortedArr;
    }
}
