package com.cognizant.constructor;

public class DataClass {
    private String name;
    private int RegisterNo;

    public DataClass(String name, int registerNo) {
        this.name = name;
        RegisterNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }
    public void printData()
    {
        System.out.println("Register Number is "+getRegisterNo()+" Name is "+getName());
    }
}
