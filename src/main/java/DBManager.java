import java.sql.*;

public final class DBManager {
    ConnectionBuilder connectionBuilder;

    public DBManager(ConnectionBuilder cb) {
        connectionBuilder = cb;
    }

    public void addStudent(Student s) {
        Connection c = connectionBuilder.buildConnection();
        try {
            String query = QueryGenerator.generateAddQuery(s);
            Statement st = c.createStatement();
            int result = st.executeUpdate(query);
            String info = result > 0 ? "Success! " + s.getFirst_name() + " " + s.getLast_name() + " has been added" : "Data couldn't be inserted.";
            System.out.println(info);
            c.close();

        }
        catch (Exception ex) {
            System.out.println("Error: " + (ex.getMessage()));
        }

    }

    public void removeStudent(int id) {
        Connection c = connectionBuilder.buildConnection();
        try {
            String query = QueryGenerator.generateRemoveQuery(id);
            Statement st = c.createStatement();
            int res = st.executeUpdate(query);
            String info = res > 0 ? "Student with id " + id + " has been deleted" : "Something went wrong.";
            System.out.println(info);
            c.close();
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void displayStudents() {
        Connection c = connectionBuilder.buildConnection();
        String query = QueryGenerator.generateSelectQuery();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
                        rs.getString(3) + " " + rs.getString(4) + " " +
                        rs.getInt(5) + " " + rs.getInt(6));
            }
        }
        catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }

    }


}
