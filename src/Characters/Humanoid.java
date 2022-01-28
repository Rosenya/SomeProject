package Characters;

public class Humanoid {

    protected char size;
    protected String language;
    protected int speed;
    protected int sight;
    protected int healthPoints;
    protected int manaPoints;
    protected int strength;
    protected int dexterity;
    protected int condition;
    protected int intelligence;
    protected int knowlage;
    protected int charisma;
    protected int dmg;


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getKnowlage() {
        return knowlage;
    }

    public void setKnowlage(int knowlage) {
        this.knowlage = knowlage;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    protected Humanoid(int manaPoints, int strength, int dexterity, int condition, int intelligence,
                    int knowlage, int charisma) {


        this.manaPoints = manaPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.condition = condition;
        this.intelligence = intelligence;
        this.knowlage = knowlage;
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return "" + healthPoints + manaPoints + strength + dexterity + condition + intelligence + knowlage + charisma;
    }
}
