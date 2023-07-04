package com.company;

public class Student {
    private  int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id  , String name , int grade)
    {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    void setGrade(int grade)
    {
        this.grade = grade;
    }

    // Example -> feespaid = 10000 + 5000 + 15000
    // the school is going to receive the funds

    void payFees(int fees)
    {
        feesPaid = feesPaid + fees;
        School.updateTotalMoneyEarned(fees);
    }


    public  int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    public  int getFeesPaid()
    {
        return feesPaid;
    }

    public int  getFeesTotal()
    {
        return feesTotal;
    }

    public int getGrade()
    {
        return grade;
    }

    public int getRemainingFees()
    {
        return feesTotal-feesPaid;
    }





}
