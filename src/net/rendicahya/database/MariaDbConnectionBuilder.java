package net.rendicahya.database;

import java.sql.Connection;
import java.sql.SQLException;

public class MariaDbConnectionBuilder {

    public static Connection build(DatabaseUrl url, String username, String password) throws ClassNotFoundException, SQLException {
        return DatabaseConnectionBuilder.build("org.mariadb.jdbc.Driver", url, username, password);
    }
}
