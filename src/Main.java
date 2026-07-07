import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

                Guidance guidance = new Guidance();

                Undergraduates student1 = new Undergraduates(1, "Esperance", 23, 80,"SheCanCode",4.3,5,"java programing");

                Graduates student2 = new Graduates(2, "Jean", 25, 45.5, 3.7);

                Instructor instructor = new Instructor(1, "Dr. Alice", 45, "Computer Science");

                Course java = new Course(101, "Java Programming", 3);

                Course database = new Course(102, "Database Systems", 4);

                // Add students
                guidance.addStudent(student1);
                guidance.addStudent(student2);

                // Add courses
                guidance.addCourse(java);
                guidance.addCourse(database);

                // Assign instructor
                guidance.assignInstructor(java, instructor);

                System.out.println("******* STUDENTS ********");
                guidance.displayStudents();

                System.out.println("******COURSES ******");
                guidance.displayCourses();

                System.out.println("*******INSTRUCTOR ASSIGNMENTS *******");
                guidance.displayInstructorAssignments();


        java.enrollStudent(student1);
        java.enrollStudent(student2);

        System.out.println("Students enrolled in Java Programming:");
        java.displayEnrolledStudents();

        CourseDAO courseDAO = new CourseDAO();
        courseDAO.createTable();

        Course course = new Course();
        course.setCourseName("Public Health 101");
        course.setCourseCode(2001);
        course.setCourseCredit(3);
        courseDAO.insertValues(course);

        List<Course> AllCourses = courseDAO.viewAll();
        for (Course courses : AllCourses) {
            System.out.println(courses.getId() + "--" + courses.getCourseCode() + "--" + courses.getcourseCredit() + "--" + courses.getCourseCode()+"--"+ courses.getCourseName());
        }
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.createTable();

        Student student = new Student();
        student.setName("Esperance");
        student.setAge(23);
        student.setProgram("SheCanCode");
        student.setGpa(4.3);
        studentDAO.insertValues(student1);

        List<Student> allStudents = studentDAO.viewAll();
        for (Student students : allStudents) {
            System.out.println(students.getId() + "--" + students.getName() + "--" + students.getProgram() + "--" + students.getGpa());
        }    }}