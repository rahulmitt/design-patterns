package com.rahulmitt.interviewpedia.dp.structural.Composite;

public class CompositeMain {
    public static void main(String[] args) {
        Component leaf1 = new Leaf(" leaf#1");
        Component leaf2 = new Leaf(" leaf#2");
        Component leaf3 = new Leaf(" leaf#3");

        Component branch1 = new Composite(" branch1");
        Component branch2 = new Composite(" branch2");

        Component trunk = new Composite("trunk");

        // Add leaf1 and leaf2 to branch1
        branch1.add(leaf1);
        branch1.add(leaf2);

        // Add branch1 to trunk
        trunk.add(branch1);

        // Add leaf3 to branch2
        branch2.add(leaf3);

        // Add branch2 to trunk
        trunk.add(branch2);

        // Show trunk composition
        System.out.println("Displaying trunk composition:");
        trunk.display();

        // Remove branch1 and branch2 from trunk
        trunk.remove(branch1);
        trunk.remove(branch2);

        // Show trunk composition now
        System.out.println("Displaying trunk composition now:");
        trunk.display();
    }
}