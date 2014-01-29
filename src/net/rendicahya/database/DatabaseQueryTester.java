package net.rendicahya.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class DatabaseQueryTester {

    public static boolean test(Connection connection) {
        PreparedStatement statement;

        try {
            statement = connection.prepareStatement("SELECT 46");
        } catch (SQLException e) {
            return false;
        }

        try {
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int result = resultSet.getInt(1);

            if (result == 46) {
                return true;
            }
        } catch (SQLException e) {
            return false;
        }

        return false;
    }
}
