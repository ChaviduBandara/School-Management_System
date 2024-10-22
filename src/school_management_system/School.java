package school_management_system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpend;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpend = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    // the total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // adds the total money earned by the school
    // Money earned - money that is supposed to add be added
    public void setTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    // total money spend by the school
    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    // update the money spent by the school (the salary given by the school to the teacher)
    // ** other expenses of the school are neglected.
    // moneySpend - money that is spent by the school
    public void setTotalMoneySpend(int moneySpend) {
        totalMoneyEarned -= moneySpend;
    }
}
