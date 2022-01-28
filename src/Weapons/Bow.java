package Weapons;

public class Bow {

    public Bow(double weaponDMG, double range, double weight) {
        this.weaponDMG = weaponDMG;
        this.range = range;
        this.weight = weight;
    }

    private double weaponDMG;
    private double range;
    private double weight;

    public double getWeaponDMG() {
        return weaponDMG;
    }

    public void setWeaponDMG(double weaponDMG) {
        this.weaponDMG = weaponDMG;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
