import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public final class ConnectionBuilder {
    public Connection buildConnection() {
        String user = ConnectionInfo.DBUser;
        String host = ConnectionInfo.DBHost;
        String pass = ConnectionInfo.DBPass;
        String name = ConnectionInfo.DBName;
        Connection c = null;

        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser(user);
            ds.setServerName(host);
            ds.setPassword(pass);
            ds.setDatabaseName(name);
            ds.setUseSSL(false);
            ds.setServerTimezone("GMT+2");
            c = ds.getConnection();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return c;
    }
}
