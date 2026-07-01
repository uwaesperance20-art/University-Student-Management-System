public class Undergraduates extends Student{
    private int credit;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;


    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Undergraduates(int id, String name, int age, double marks, double gpa, int credit, String courseName) {
        super(id, name, age, marks, gpa);
        this.credit=credit;
        this.courseName=courseName;

    }

    @Override
    public double calculateGPA() {
        return super.calculateGPA();
    }
}
