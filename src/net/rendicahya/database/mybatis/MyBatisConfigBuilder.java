package net.rendicahya.database.mybatis;

import javax.sql.DataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class MyBatisConfigBuilder {

    public static final int MYSQL = 0;

    public static Configuration build(int databaseEngine, String host, int port, String databaseName, String username, String password) {
        String driver = null;
        String protocol = null;

        if (databaseEngine == MYSQL) {
            protocol = "jdbc:mysql";
            driver = "com.mysql.jdbc.Driver";
        }

        DataSource dataSource = new PooledDataSource(driver, protocol + "://" + host + ":" + port + "/" + databaseName, username, password);
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);

        return new Configuration(environment);
    }

    public static Configuration build(int databaseEngine, String host, String databaseName, String username, String password) {
        return build(databaseEngine, host, 3306, databaseName, username, password);
    }

    public static Configuration build(String host, String databaseName, String username, String password) {
        return build(MYSQL, host, databaseName, username, password);
    }
}
