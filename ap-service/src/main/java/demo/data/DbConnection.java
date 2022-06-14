package demo.data;

import demo.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class DbConnection {

    static Logger LOGGER = LogManager.getLogger("DataBaseConnection");

    protected static Connection conn;

    protected static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(Config.DB_URL, Config.DB_USER, Config.DB_PASSWORD);
            LOGGER.info("DB connected");
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

    protected static void disconnect() {
        if (conn == null)
            return;
        try {
            conn.close();
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
