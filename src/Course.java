import java.util.ArrayList;
import java.util.List;
public class Course {
private List<Student>enrolledStudents=new ArrayList<>();

    public Course() {

    }

    public Course(int i, String databaseSystems, int i1) {
    }

    public void enrollStudent(Student student) {

        enrolledStudents.add(student);
    }

    public void displayEnrolledStudents() {
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }

    private int id;
    private int courseCode;
    private String courseName;
    private int courseCredit;

    public Course(int id,int courseCode, String courseName, int courseCredit) {

       this.id=id;
       this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getcourseCredit() {
        return courseCredit;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "enrolledStudents=" + enrolledStudents +
                ", id=" + id +
                ", courseCode=" + courseCode +
                ", courseName='" + courseName + '\'' +
                ", courseCredit=" + courseCredit +
                '}';
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit= courseCredit;
    }


    }


