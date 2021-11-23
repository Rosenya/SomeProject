package Dices;

import java.util.Random;

public class K10 {
    public static void main(String[] args) {
        int[] k10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int roll = new Random().nextInt(k10.length);
        System.out.println(roll);
    }
}
