package net.rendicahya.database;

public class MySqlUrl extends DatabaseUrl {

    public MySqlUrl(String host, int port, String name, String parameter) {
        super("jdbc:mysql", host, port, name, parameter);
    }

    public MySqlUrl(String host, String name, String parameter) {
        this(host, 3306, name, parameter);
    }

    public MySqlUrl(String host, String name) {
        this(host, 3306, name, null);
    }
}
