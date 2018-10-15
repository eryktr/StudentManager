import java.sql.Connection;

public class Program {
    public static void main(String[] args)
    {
        ConnectionBuilder cb = new ConnectionBuilder();
        DBManager db = new DBManager(cb);
        UserInterface ui = new UserInterface(db);
        ui.start();
    }
}
