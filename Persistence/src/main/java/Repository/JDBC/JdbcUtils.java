package Repository.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    private Connection instance = null;

    private Connection getNewConnection() {
        String url = "jdbc:sqlite:C:\\Users\\anna\\OneDrive\\Desktop\\FACULTATE\\SGCM.sqlite";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public Connection getConnection(){
        try{
            if(instance==null||instance.isClosed()){
                instance=getNewConnection();
            }
        } catch (SQLException e) {
            System.out.println("Error DB "+e);
        }
        return instance;
    }
}
