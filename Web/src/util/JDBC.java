package util;


import com.sun.org.apache.regexp.internal.RE;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBC {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    private static JDBC jdbc;

    private JDBC(){

    }

    public static JDBC getInstance(){
        if (jdbc == null) {
            jdbc = new JDBC();
        }
        return jdbc;
    }

    static{
        try {
            InputStream is = JDBC.class.getClassLoader().getResourceAsStream("util.Mysql");
            Properties properties = new Properties();
            properties.load(is);
            driver = properties.getProperty("diver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            Class.forName(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConn() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Connection connection , PreparedStatement psmt , ResultSet rs){
        try {
            if (connection != null) {
                connection.close();
            }
            if (psmt != null) {
                psmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
