package Dices;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class K6 extends JPanel {
    public static void main(String[] args) {
        int[] k6 = { 1, 2, 3, 4, 5, 6 };
        int roll = new Random().nextInt(k6.length + 1);
        System.out.println(k6[roll]);

        JFrame d6 = new JFrame("k6 roll");
        d6.setVisible(true);
        d6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d6.add(new JPanel());

        d6.setPreferredSize(new Dimension(500, 500));
        d6.pack();
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.fillOval(225, 275, 50, 50);

    }

}

