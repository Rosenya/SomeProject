package Dices;


import java.util.Random;

public class K6 implements Dice {

    @Override
    public int roll() {
        int[] k6 = { 1, 2, 3, 4, 5, 6 };
        int roll = new Random().nextInt(k6.length + 1);
        return roll;
    }
}



