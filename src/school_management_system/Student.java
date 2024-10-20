package school_management_system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    // we are not going to alter(change) the students name and id;

    public void setGrade(int grade){
        this.grade = grade;
    }
}
