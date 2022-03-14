package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Vardenis", "Pavardenis", ContractType.PartTime, 2015, 01, 13, 1500, "Padavejas");
        System.out.println(employee1.toString());
    }
}
