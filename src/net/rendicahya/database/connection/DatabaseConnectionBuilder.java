package net.rendicahya.database.connection;

import net.rendicahya.database.url.DatabaseURL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnectionBuilder {

    public static Connection build(String driver, DatabaseURL url, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);

        return DriverManager.getConnection(url.toString(), username, password);
    }
}
