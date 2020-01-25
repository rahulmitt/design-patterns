package com.rahul.designpatterns.gof.p1_creational.p4_prototype;

public class SwordsMan extends GameUnit {
    private String state = "idle";

    public void attack() {
        this.state = "attach";
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return "SwordsMan { state=" + state + ", position=" + getPosition() + " }";
    }
}
