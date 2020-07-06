package com.rahulmitt.interviewpedia.dp.structural.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Component {
    String name;
    List<Component> children = new ArrayList<>();

    public Composite(String parm) {
        this.name = parm;
        System.out.println(parm.trim() + " constructed.");
    }

    public String getName() {
        return name;
    }

    public Component getChild(int index) {
        Component child;
        try {
            child = children.get(index);
        } catch (IndexOutOfBoundsException e) {
            child = null;
        }
        return child;
    }

    public void add(Component child) {
        try {
            System.out.println("Adding " + child.getName().trim() + " to " + this.getName().trim());
            children.add(child);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(Component child) {
        try {
            System.out.println("Removing " + child.getName().trim() + " from " + this.getName().trim());
            children.remove(child);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        Iterator<Component> iterator = children.iterator();
        System.out.println(this.getName() + (iterator.hasNext() ? " with the following: " : " that is bare."));
        while (iterator.hasNext()) {
            (iterator.next()).display();
        }
    }
}
