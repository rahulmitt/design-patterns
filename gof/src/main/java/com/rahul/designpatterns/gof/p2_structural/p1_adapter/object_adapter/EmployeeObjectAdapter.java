package com.rahul.designpatterns.gof.p2_structural.p1_adapter.object_adapter;

// Represents Object-Adapter - uses COMPOSITION to translate interface
public class EmployeeObjectAdapter implements Customer {
    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
