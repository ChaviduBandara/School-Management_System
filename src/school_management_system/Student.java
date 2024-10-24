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

    // keep adding the fees to the feesPaid field
    // the school is going to receive the funds
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal()    {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }
}
