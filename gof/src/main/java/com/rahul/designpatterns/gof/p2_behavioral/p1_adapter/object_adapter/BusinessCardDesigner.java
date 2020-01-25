package com.rahul.designpatterns.gof.p2_behavioral.p1_adapter.object_adapter;

// Represents the client
public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(customer.getName()).append("\n");
        sb.append("Designation: ").append(customer.getDesignation()).append("\n");
        sb.append("Address: ").append(customer.getAddress());
        return sb.toString();
    }
}
