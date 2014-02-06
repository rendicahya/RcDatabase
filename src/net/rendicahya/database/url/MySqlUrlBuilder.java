package net.rendicahya.database.url;

public final class MySqlUrlBuilder {

    public static DatabaseURL build(String host, int port, String name, String parameter) {
        return DatabaseUrlBuilder.build("jdbc:mysql", host, port, name, parameter);
    }

    public static DatabaseURL build(String host, String name, String parameter) {
        return build(host, 3306, name, parameter);
    }

    public static DatabaseURL build(String host, String name) {
        return build(host, name, null);
    }
}
