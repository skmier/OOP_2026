package practice4.BonusTask.services;

import practice4.BonusTask.model.Sortable;

public class CountingSortServiceSecond implements Sortable {
    @Override
    public int[] sort(int[] arr){
        int[] cnt = new int[11];

        for (int i : arr){
            cnt[i]++;
        }

        int[] res = new int[11];
        int index = 0;

        for(int i = 0; i < 11;i++){
            while (cnt[i] > 0){
                res[index] = i;
                index++;
                cnt[i]--;
            }
        }
        return res;
    }
}
