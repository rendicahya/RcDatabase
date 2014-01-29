package net.rendicahya.database;

import java.sql.Connection;
import java.sql.SQLException;

public final class MySqlConnectionBuilder {

    public static Connection build(DatabaseURL url, String username, String password) throws ClassNotFoundException, SQLException {
        return DatabaseConnectionBuilder.build("com.mysql.jdbc.Driver", url, username, password);
    }
}
