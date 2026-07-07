public class Student extends Person {
    private double marks;
    private double gpa;
    private String  program;

    public Student(int id, String name, int age, double marks,String program, double gpa) {
        super(id, name, age);
        this.marks=marks;
        this.gpa=gpa;
        this.program=program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Student() {
        super();
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
