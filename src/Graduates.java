public class Graduates extends Student{
    private int courseCredits;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;


    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public Graduates(int id, String name, int age, double marks, double gpa, int courseCredits, String courseName) {
        super(id, name, age, marks, gpa);
        this.courseCredits=courseCredits;
        this.courseName=courseName;

    }

    @Override
    public double calculateGPA() {
        double adjustedGPA = getGpa() + 0.2;

        return Math.min(adjustedGPA, 4.0);

    }
}
