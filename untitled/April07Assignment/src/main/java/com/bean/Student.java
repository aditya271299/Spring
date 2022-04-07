package com.bean;

public class Student {
    private int sId;
    private String sName;
    private Address sAdd;
    public Student(int sId, String sName,Address sAdd){
        this.sId=sId;
        this.sName=sName;
        this.sAdd=sAdd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAdd=" + sAdd +
                '}';
    }
}
