package Dices;

import javax.swing.*;
import java.util.Random;

public class K4 {
        public static void main(String[] args) {
                int[] k4 = { 1, 2, 3, 4 };
                int roll = new Random().nextInt(k4.length + 1);
                System.out.println(roll);

                /*
                        JFrame d4 = new JFrame("k4 roll");
                 d4.setVisible(true);
                 d4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 d4.add(new JPanel());
                */

        }


}
