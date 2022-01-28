package Dices;

import java.util.Random;

public class K10 implements Dice {
    @Override
    public int roll() {
        int[] k10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int roll = new Random().nextInt(k10.length);
        return roll;
    }
}
