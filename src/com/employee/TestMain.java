package com.employee;
import com.employee.Employee;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee employee =  new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee);  // toString();

        // Test Setters and Getters
        employee.setSalary(999);
        System.out.println(employee);  // toString();
        System.out.println("id is: " + employee.getID());
        System.out.println("firstname is: " + employee.getFirstName());
        System.out.println("lastname is: " + employee.getLastName());
        System.out.println("salary is: " + employee.getSalary());

        System.out.println("name is: " + employee.getName());
        System.out.println("annual salary is: " + employee.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee);

        //down casting example
        int x =(int) 4.6f;
        int y = Math.round(4.6f);
        System.out.println(x + " "+ y);

    }
}
