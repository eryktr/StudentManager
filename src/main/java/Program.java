import java.sql.Connection;

public class Program {
    public static void main(String[] args)
    {
        ConnectionBuilder cb = new ConnectionBuilder();
        DBManager db = new DBManager(cb);
        db.addStudent(new Student("Test", "Student", Faculty.W11, 5, 21));
        System.out.println("I work");
    }
}
