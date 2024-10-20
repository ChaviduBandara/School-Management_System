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

    public void updateTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void updateStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    public void setTotalMoneySpend(int totalMoneySpend) {
        this.totalMoneySpend = totalMoneySpend;
    }
}
