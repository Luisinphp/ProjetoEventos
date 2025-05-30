package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    private static final String URL = "jdbc:sqlite:eventos.db";

    public static Connection conn() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
