package com.company;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers = new ArrayList<>();    // many teacher
    private List<Student> students = new ArrayList<>();   // many students
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public  School(List<Teacher> teachers , List<Student> students)
    {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }



    public List<Teacher> getTeachers()
    {
        return teachers;
    }

    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public int getTotalMoneyEarned()
    {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned)
    {
        totalMoneyEarned = totalMoneyEarned + MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @param moneySpent - is basically money which is given to the teacher as the salary
     */

    public static void  updateTotalMoneySpent(int moneySpent)
    {
        totalMoneyEarned-=moneySpent;
    }

}
