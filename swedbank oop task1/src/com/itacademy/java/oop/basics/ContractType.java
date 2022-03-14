package com.itacademy.java.oop.basics;

public enum ContractType {
    FullTime("FT"),
    PartTime("PT");

    public final String contractType;

    ContractType(String contractType) {
        this.contractType = contractType;
    }
}
