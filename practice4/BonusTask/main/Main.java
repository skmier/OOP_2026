package practice4.BonusTask.main;

import practice4.BonusTask.services.CountingSortService;
import practice4.BonusTask.services.CountingSortServiceSecond;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountingSortService ser = new CountingSortService();
        CountingSortServiceSecond s2 = new CountingSortServiceSecond();
        int[] arr = { 1, 4, 1, 1, 2, 0, 5, 5 , 3, 2, 1};
        int[] res = ser.sort(arr);
        int[] secondVar = s2.sort(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(secondVar));
    }
}
