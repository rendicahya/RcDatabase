package net.rendicahya.database;

import java.sql.Connection;
import java.sql.SQLException;

public final class MariaDbConnectionBuilder {

    public static Connection build(DatabaseURL url, String username, String password) throws ClassNotFoundException, SQLException {
        return DatabaseConnectionBuilder.build("org.mariadb.jdbc.Driver", url, username, password);
    }
}
