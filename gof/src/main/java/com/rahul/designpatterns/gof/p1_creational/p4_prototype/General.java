package com.rahul.designpatterns.gof.p1_creational.p4_prototype;

public class General extends GameUnit {
    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are uniquq");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override
    public String toString() {
        return "General { state=" + state + ", position=" + getPosition() + " }";
    }
}
