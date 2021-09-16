package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] cars = {6, 2, 12, 7};
        int k = 4;

        int answer = Solution.carParkingRoof(cars, k);
        System.out.println(answer);
    }

}

class Solution {


    public static int carParkingRoof(int[] cars, int k) {
        Arrays.sort(cars);

        int length = cars.length;

        int result = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < length; i++) {
            int roofSize = cars[i + k - 1] - cars[i] + 1;
            result = Math.min(result, roofSize);
        }

        return result;

    }


}
