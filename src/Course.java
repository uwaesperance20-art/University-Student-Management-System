
public class Course {
    private List<Student> enrolledStudents = new ArrayList<>();

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayEnrolledStudents() {
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }

    private int courseId;
    private String courseName;
    private int creditHours;

    public Course(int courseId, String courseName, int creditHours) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {

        return "Course ID: " + courseId +
                "\nCourse Name: " + courseName +
                "\nCredit Hours: " + creditHours;
    }
}

