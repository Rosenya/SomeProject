package Dices;

import java.util.Random;

public class K8 {
    public static void main(String[] args) {
        int[] k8 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int roll = new Random().nextInt(k8.length);
        System.out.println(roll);
    }
}
