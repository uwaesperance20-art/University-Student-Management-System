import com.sun.source.tree.Scope;

import java.util.*;

public class Guidance {
    private List<Student> students = new ArrayList<>();
    private Set<Course> courses = new HashSet<>();
    private Map<Course, Instructor> instructors = new HashMap<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<Course, Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(Map<Course, Instructor> instructors) {
        this.instructors = instructors;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    // addition of student
    public void addStudent(Student student) {

        students.add(student);

        System.out.println(student.getName() + "  student added well.");
    }

    //view student
    public void displayStudent() {

        for (Student student : students) {

            System.out.println("**********");

            System.out.println(student);


        }
    }
// add course
    public void addCourse(Course course) {

        courses.add(course);
        System.out.println(course.getCourseName()+ "course added successful");
    }
    public void assignInstructor(

            Course course,

            Instructor instructor){

        instructors.put(course,instructor);

    }
    public void displayInstructorAssignments(){

        for(Map.Entry<Course,Instructor> entry :

                instructors.entrySet()){

            System.out.println(

                    "Course : " + entry.getKey().getCourseName() + "\nInstructor : " + entry.getValue().getName());

            System.out.println("************");

        }

    }

    public void displayStudents() {
    }

    public void displayCourses() {
    }
}
