import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    Connection connection;

    public DBManager(Connection c) {
        connection = c;
    }




}
