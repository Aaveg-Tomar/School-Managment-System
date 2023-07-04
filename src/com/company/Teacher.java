package com.company;

public class Teacher {
    private int id ;
    private String name;
    private int salary;

    /**
     *
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(int id , String name , int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    public int getSalary()
    {
        return this.salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
        School.updateTotalMoneySpent(salary);
    }


}
