package Dices;

import java.util.Random;

public class K12 implements Dice {
@Override
public int roll() {
        int[] k12 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int roll = new Random().nextInt(k12.length);
        return roll;
        }
}