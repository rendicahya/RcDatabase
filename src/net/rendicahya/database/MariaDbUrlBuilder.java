package net.rendicahya.database;

public final class MariaDbUrlBuilder {

    public static DatabaseURL build(String host, int port, String name, String parameter) {
        return DatabaseUrlBuilder.build("jdbc:mariadb", host, port, name, parameter);
    }

    public static DatabaseURL build(String host, String name, String parameter) {
        return build(host, 3306, name, parameter);
    }

    public static DatabaseURL build(String host, String name) {
        return build(host, name, null);
    }
}
