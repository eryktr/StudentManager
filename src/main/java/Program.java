import java.sql.Connection;

public class Program {
    public static void main(String[] args)
    {
        ConnectionBuilder cb = new ConnectionBuilder();
        Connection c = cb.buildConnection();
        DBManager db = new DBManager(c);
        System.out.println("I work");
    }
}
