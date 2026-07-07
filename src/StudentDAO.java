import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    Connection connection;

    public StudentDAO() throws SQLException {
        connection = DatabaseConnection.createConnection();
    }

    public void createTable() throws SQLException {
        String createSql = """
        create table if not exists Student(
            id serial primary key,
            name varchar(50),
            age int,
            program varchar(50),
            gpa numeric
        )
        """;
        PreparedStatement statement = connection.prepareStatement(createSql);
        statement.executeUpdate();
        System.out.println("Student table is created");
    }

    public void insertValues(Student student) throws SQLException {
        String insertSql = "insert into Student(name, age, program, gpa) values (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertSql);
        statement.setString(1, student.getName());
        statement.setInt(2, student.getAge());
        statement.setString(3, student.getProgram());
        statement.setDouble(4, student.getGpa());
        statement.executeUpdate();
        System.out.println("Student inserted");
    }

    public List<Student> viewAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        String selectSql = "SELECT * FROM Student";
        PreparedStatement statement = connection.prepareStatement(selectSql);
        ResultSet resultSets = statement.executeQuery();

        while (resultSets.next()) {
            Student student = new Student();
            student.setId(resultSets.getInt("id"));
            student.setName(resultSets.getString("name"));
            student.setAge(resultSets.getInt("age"));
            student.setProgram(resultSets.getString("program"));
            student.setGpa(resultSets.getDouble("gpa"));
            students.add(student);
        }

        return students;
    }
}