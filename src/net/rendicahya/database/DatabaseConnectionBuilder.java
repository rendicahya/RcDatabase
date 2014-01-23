package net.rendicahya.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionBuilder {

    public static Connection build(String driver, DatabaseUrl url, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);

        return DriverManager.getConnection(url.toString(), username, password);
    }
}
