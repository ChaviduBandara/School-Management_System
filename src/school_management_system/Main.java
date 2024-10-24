package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher(1, "Jizzy", 750);
        Teacher t2 = new Teacher(2, "Tom", 800);
        Teacher t3 = new Teacher(3, "Ben", 700);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        Student s1 = new Student(1, "Jim", 11);
        Student s2 = new Student(2, "kevin", 12);
        Student s3 = new Student(3, "margret", 12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        School ris = new School(teacherList, studentList);

        s1.payFees(5000);
        System.out.println("ris has earned : " + ris.getTotalMoneyEarned());
        s2.payFees(6000);
        System.out.println("ris has earned : " + ris.getTotalMoneyEarned() + "\n");


        System.out.println("***Making ris pay salary to the teachers");

        t1.receiveSalary(t1.getSalary());
        System.out.println("ris has spent for salary to " + t1.getName() + " and now has : " + ris.getTotalMoneyEarned());

        t2.receiveSalary(t2.getSalary());
        System.out.println("ris has spent for salary to " + t2.getName() + " and now has : " + ris.getTotalMoneyEarned());
    }
}
