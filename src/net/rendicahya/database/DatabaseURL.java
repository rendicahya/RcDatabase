package net.rendicahya.database;

public class DatabaseURL {

    private String protocol;
    private String host;
    private int port;
    private String name;
    private String parameter;

    public DatabaseURL(String protocol, String host, int port, String name, String parameter) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.name = name;

        setParameter(parameter);
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        if (parameter == null || parameter.trim().isEmpty()) {
            return;
        }

        if (!parameter.startsWith("?")) {
            parameter = "?" + parameter;
        }

        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return protocol + "://" + host + ":" + port + "/" + name + (parameter == null ? "" : parameter);
    }
}
