package net.rendicahya.database.url;

public final class DatabaseUrlBuilder {

    private DatabaseUrlBuilder() {
    }

    public static DatabaseURL build(String protocol, String host, int port, String name, String parameter) {
        return new DatabaseURL(protocol, host, port, name, parameter);
    }
}
