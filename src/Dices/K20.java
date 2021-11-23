package Dices;

import java.util.Random;

public class K20 {
    public static void main(String[] args) {
        int[] k20 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int roll = new Random().nextInt(k20.length);
        System.out.println(roll);
    }
}
