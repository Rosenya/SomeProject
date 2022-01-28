package Dices;

import java.util.Random;

public class K4 implements Dice {
        @Override
        public int roll() {
                int[] k4 = { 1, 2, 3, 4 };

                int roll = new Random().nextInt(k4.length + 1);
                return roll;
        }
}
