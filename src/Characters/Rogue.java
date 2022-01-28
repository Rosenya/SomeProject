package Characters;

import Dices.Dice;
import Dices.K6;
import Dices.K8;

public class Rogue extends Humanoid implements Attack{
    public static void main(String[] args) {
        K6 k6Roll = new K6();
        Rogue rogue = new Rogue(0,0,2,2,0,0,2);
        K8 k8Roll = new K8();
        Rogue npc = new Rogue(0,0,2,2,0,0,2);
        rogue.attack(npc);

    }
    private boolean canUseBow;


    public Rogue(int manaPoints, int strength, int dexterity, int condition, int intelligence, int knowlage, int charisma) {
        super(manaPoints, strength, dexterity, condition, intelligence, knowlage, charisma);
        this.healthPoints = rollHP(new K6(), 3);
        this.dmg = rollDMG(new K8(),1);
    }


    @Override
    public int attack(int dmg, Rogue npc) {
        this.dmg = dmg;
        int hp = npc.healthPoints;
        npc.healthPoints = hp - dmg;
        System.out.println(dmg);
        System.out.println(npc.healthPoints);
        return npc.healthPoints;
    }



    public int rollHP (Dice dice, int rolls) {
        int hp = 0;
        for (int i = 0; i < rolls; i++) {
           hp += dice.roll();
        }
        return hp;
    }

    public int rollDMG (Dice dice, int rolls) {
        int dmg = 0;
        for (int i = 0; i < rolls; i++) {
            dmg += dice.roll();
        }
        return dmg;
    }
}
