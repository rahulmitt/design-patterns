package com.rahul.designpatterns.gof.p2_structural.p1_adapter.class_adapter;

// Represents Class-Adapter (two-way adapter) - uses INHERITANCE
public class EmployeeClassAdapter extends Employee implements Customer {
    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
