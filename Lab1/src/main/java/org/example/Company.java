package org.example;

import java.util.Arrays;

public class Company {
    private String name;
    private Employee[] employees = new Employee[5];

    public Company(String name) {
        this.name = name;
      //  this.employees = new Employee[5];
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getAverageAge() {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        return  totalAge / employees.length;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
