
public class Main {

    public static void main(String[] args) {

                Guidance guidance = new Guidance();

                Undergraduates student1 = new Undergraduates(1, "Esperance", 23, 3.8,2.5,4,"");

                Graduates student2 = new Graduates(2, "Jean", 25, "Software Engineering", 3.7);

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

                System.out.println("===== STUDENTS =====");
                guidance.displayStudents();

                System.out.println("===== COURSES =====");
                guidance.displayCourses();

                System.out.println("===== INSTRUCTOR ASSIGNMENTS =====");
                guidance.displayInstructorAssignments();
            }
        }
        java.enrollStudent(student1);
        java.enrollStudent(student2);

        System.out.println("Students enrolled in Java Programming:");
        java.displayEnrolledStudents();


    }
}