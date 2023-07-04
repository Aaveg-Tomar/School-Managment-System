package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith Vasudev",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School bbps = new School(teacherList , studentList);
        System.out.println("Earned money " + bbps.getTotalMoneyEarned());

        tamasha.payFees(5000);
        System.out.println("Earned money " + bbps.getTotalMoneyEarned());
        tamasha.payFees(5000);
        System.out.println("Earned money " + bbps.getTotalMoneyEarned());

        System.out.println("Remaining fees " + tamasha.getRemainingFees());

        rakshith.payFees(3000);

        System.out.println("Remaining fees " + rakshith.getRemainingFees());
        rakshith.payFees(3000);

        System.out.println("Earned money " + bbps.getTotalMoneyEarned());


        lizzy.setSalary(2000);
        System.out.println("Lizzy Salary = " + lizzy.getSalary() );

        System.out.println("Earned money " + bbps.getTotalMoneyEarned());









    }
}
