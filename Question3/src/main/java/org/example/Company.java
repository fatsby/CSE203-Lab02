package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private int basicSalary;
    private ArrayList<Employee> employees;
    private static Scanner sc = new Scanner(System.in);

    public Company(int basicSalary) {
        employees = new ArrayList<>();
        this.basicSalary = basicSalary;
    }
    public Company(){
        employees = new ArrayList<>();
    }

    public void inputEmployees(){
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee newEmployee = new Employee();
            newEmployee.setBasicSalary(this.basicSalary);
            newEmployee.input();
            employees.add(newEmployee);
        }
    }
    public void printSalarySheet(){
        System.out.println("Printing Salary Sheet");
        for (Employee employee : employees) {
            employee.printSalary();
        }
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void printEmployeesBySalary(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });

        // Print out sorted employees
        System.out.println("Sorting by descending Salary");
        for (Employee employee : employees) {
            System.out.println("Employee name: " + employee.getName() + " | Salary: " + employee.getSalary());
        }
    }
    public void highestSalaryEmployee(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });

        System.out.println("Employee with highest Salary: " + employees.get(0).getName() + " | Salary: " + employees.get(0).getSalary());
    }

}
