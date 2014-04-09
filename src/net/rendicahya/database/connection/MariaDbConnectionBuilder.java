package net.rendicahya.database.connection;

import net.rendicahya.database.url.DatabaseURL;
import java.sql.Connection;
import java.sql.SQLException;

public final class MariaDbConnectionBuilder {

    public static Connection build(DatabaseURL url, String username, String password) throws ClassNotFoundException, SQLException {
        return DatabaseConnectionBuilder.build(url, username, password);
    }
}
