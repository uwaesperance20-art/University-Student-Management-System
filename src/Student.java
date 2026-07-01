public class Student extends Person {
    private double marks;
    private double gpa;

    public Student(int id, String name, int age, double marks, double gpa) {
        super(id, name, age);
        this.marks=marks;
        this.gpa=gpa;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double calculateGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", gpa=" + gpa +
                '}';
    }
}
