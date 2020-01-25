package com.rahul.designpatterns.gof.p1_creational.p4_prototype;

import javafx.geometry.Point3D;

/*
    This class:
    1. implements the marker interface: Cloneable
    2. represents an abstract prototype & defines the clone() method
*/
public abstract class GameUnit implements Cloneable {
    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    /*
        1. Make sure this method is public
        2. The return type is not Object; it should be the type of object being cloned
    */
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        // if the properties are immutable, we can implement shallow copy. Else we need deep copy
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    // resets the properties inherited from parent class
    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    // resets the properties of class
    protected abstract void reset();

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition(){
        return this.position;
    }
}
