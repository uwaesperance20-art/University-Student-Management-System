
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection createConnection() throws SQLException {

        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/University DB", "postgres", "Uwaespe123@"
        );
    }

    public static Connection getConnection() {
        return null;
    }

    public static PreparedStatement prepareStatement(String createSql) {
        return null;
    }
}

