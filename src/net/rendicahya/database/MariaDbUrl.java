package net.rendicahya.database;

public class MariaDbUrl extends DatabaseUrl {

    public MariaDbUrl(String host, int port, String name, String parameter) {
        super("jdbc:mariadb", host, port, name, parameter);
    }

    public MariaDbUrl(String host, String name, String parameter) {
        this(host, 3306, name, parameter);
    }

    public MariaDbUrl(String host, String name) {
        this(host, 3306, name, null);
    }
}
