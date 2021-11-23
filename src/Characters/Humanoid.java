package Characters;

public class Humanoid {
    private int height;
    private double weigth;
    private String skinColor;

public void humanoidConstructor(int height, double weigth, String skinColor){
    this.height = height;
    this.weigth = weigth;
    this.skinColor = skinColor;
}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
