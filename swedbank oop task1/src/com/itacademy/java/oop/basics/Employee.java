package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private LocalDate contractStartDate;
    private Number salary;
    private String position;

    public Employee(){}

    public Employee(String name, String surname, ContractType contractType, int startYear,
                    int startMonth, int startDay, Number salary, String position){
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = LocalDate.of(startYear, startMonth, startDay);
        this.salary = salary;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public void setSalary(Number salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public Number getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getEmployeeData() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", contractType = " + contractType +
                ", contractStartDate = " + contractStartDate +
                ", salary = " + salary +
                ", position = '" + position + '\'' +
                '}';
    }
}
