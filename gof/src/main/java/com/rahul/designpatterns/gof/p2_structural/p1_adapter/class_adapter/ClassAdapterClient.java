package com.rahul.designpatterns.gof.p2_structural.p1_adapter.class_adapter;

public class ClassAdapterClient {
    public static void main(String[] args) {
        EmployeeClassAdapter twoWayAdapter = new EmployeeClassAdapter();
        populateEmployee(twoWayAdapter);    // being used as Employee

        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(twoWayAdapter);   // being used as Customer
        System.out.println(card);
    }

    private static void populateEmployee(Employee employee) {
        employee.setFullName("Rahul Mittal");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Mumbai");
    }
}
