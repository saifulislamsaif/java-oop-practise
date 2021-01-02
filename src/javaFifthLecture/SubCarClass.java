package javaFifthLecture;

public class SubCarClass extends CarClass {
    private int Batary;
    private String Color;

    public int getBatary() {
        return Batary;
    }

    public void setBatary(int batary) {
        Batary = batary;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }


    public SubCarClass(String manu, String model, String key, int cc, float fl, int battery, String color) {
        super(manu, model, key, cc, fl);
        Batary = battery;
        this.Color = color;
    }
}
