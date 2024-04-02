package com.JavaMart.OOP_javaMart;

public class PosDTO {

    private int milk;
    private int noodle;
    private int gum;
    private int chocolate;
    private String pName;

    public PosDTO() {
    }

    public PosDTO(int milk, int noodle, int gum, int chocolate, String pName) {
        this.milk = milk;
        this.noodle = noodle;
        this.gum = gum;
        this.chocolate = chocolate;
        this.pName = pName;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getNoodle() {
        return noodle;
    }

    public void setNoodle(int noodle) {
        this.noodle = noodle;
    }

    public int getGum() {
        return gum;
    }

    public void setGum(int gum) {
        this.gum = gum;
    }

    public int getChocolate() {
        return chocolate;
    }

    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "PosDTO{" +
                "milk=" + milk +
                ", noodle=" + noodle +
                ", gum=" + gum +
                ", chocolate=" + chocolate +
                ", pName='" + pName + '\'' +
                '}';
    }
}
