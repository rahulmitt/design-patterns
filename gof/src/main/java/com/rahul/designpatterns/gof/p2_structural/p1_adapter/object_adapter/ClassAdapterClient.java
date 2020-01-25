package com.rahul.designpatterns.gof.p2_structural.p1_adapter.object_adapter;

public class ClassAdapterClient {
    public static void main(String[] args) {
        Employee employee = new Employee();
        populateEmployee(employee);

        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployee(Employee employee) {
        employee.setFullName("Rahul Mittal");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Mumbai");
    }
}
