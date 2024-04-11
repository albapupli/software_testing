package org.example;

public class CompanyTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Adela", "Merko", 22),
                new Employee("A", "S", 22),
                new Employee("Ad", "Merk", 30),
                new Employee("Bob", "Bob", 28),
                new Employee("Smith", "Smith", 55)
        };

        Company company = new Company("LHIND");
        company.setEmployees(employees);

        System.out.println(company.toString());
        System.out.println("Average age of employees: " + company.getAverageAge());
    }
}
