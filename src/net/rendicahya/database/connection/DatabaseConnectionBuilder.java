package net.rendicahya.database.connection;

import net.rendicahya.database.url.DatabaseURL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnectionBuilder {

    public static Connection build(DatabaseURL url, String username, String password) throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection(url.toString(), username, password);
    }
}
