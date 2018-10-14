import java.sql.*;

public class DBManager {
    ConnectionBuilder connectionBuilder;

    public DBManager(ConnectionBuilder cb) {
        connectionBuilder = cb;
    }

    public void addStudent(Student s) {
        Connection c = connectionBuilder.buildConnection();
        String first_name = "\"" + s.getFirst_name() +  "\"";
        String last_name = "\"" + s.getLast_name() + "\"";
        String faculty = "\"" + s.getFaculty().toString() + "\"";
        int semester = s.getSemester();
        int age = s.getAge();

        String query = "INSERT INTO student VALUES(null, " + first_name + ", " + last_name +", " + faculty + ", " + semester + ", "+age +");";
        System.out.println(query);
        try {
            Statement st = c.createStatement();
            int result = st.executeUpdate(query);
            System.out.println(result > 0 ? "Success!" : "Data couldn't be inserted.");

        }
        catch (Exception ex) {
            System.out.println("Error: "+ (ex.getMessage()));
        }

    }


}
