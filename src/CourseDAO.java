import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    Connection connection;

    public CourseDAO() throws SQLException {
        connection = DatabaseConnection.createConnection();
    }

    public void createTable() throws SQLException {
        String createSql = """
        create table if not exists Course(
            id serial primary key,
            course_name varchar(20),
            course_code varchar(34),
            course_credit int
        )
        """;
        PreparedStatement statement = connection.prepareStatement(createSql);
        statement.executeUpdate();
        System.out.println("Course table is created");
    }

    public void insertValues(Course course) throws SQLException {
        String insertSql = "insert into Course(course_name, course_code, course_credit) values (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertSql);
        statement.setString(1, course.getCourseName());
        statement.setInt(2, course.getcourseCredit());
        statement.setInt(3, course.getCourseCode());
        statement.executeUpdate();
        System.out.println("Course inserted");
    }

    public List<Course> viewAll() throws SQLException {
        List<Course> courses = new ArrayList<>();
        String selectSql = "SELECT * FROM Course";
        PreparedStatement statement = connection.prepareStatement(selectSql);
        ResultSet resultSets = statement.executeQuery();

        while (resultSets.next()) {
            Course course = new Course();
            course.setId(resultSets.getInt("id"));
            course.setCourseName(resultSets.getString("course_name"));
            course.setCourseCode(resultSets.getInt("course_code"));
            course.setCourseCredit(resultSets.getInt("course_credit"));
            courses.add(course);
        }

        return courses;
    }
}