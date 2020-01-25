package com.rahul.designpatterns.gof.p1_creational.p4_prototype;

import javafx.geometry.Point3D;

/*
    Large objects are costly to create and majority of its state remain unchanged between instances.
    In such cases, Prototype design pattern allows us to make copies of existing object and saves us
    from having to recreate objects from scratch.

    1. The class must implement the marker interface: cloneable
    2. The class should override the clone() method in Object class and return a copy of itself
        - consider deep/shallow copy and choose whichever is applicable
    3. The method should throw Clone?NotSupportedException in throws clause to let subclasses decide on whether to support cloning

    Examples of prototype in JDK
     - Object.clone() is provided by java to clone an existing object.
       Classes still need to implement Cloneable interface but this method does the job of cloning
*/
public class PrototypeClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        SwordsMan s1 = new SwordsMan();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();
        System.out.println(s1);

        SwordsMan s2 = (SwordsMan) s1.clone();
        System.out.println("Cloned SwordsMan: " + s2);
        s2.move(new Point3D(40, 30, 10), 50);
        s2.attack();
        System.out.println(s2);
    }
}
