package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static{
        try {
            Properties properties = new Properties();
            InputStream in = new FileInputStream("db.properties");
            properties.load(in);
            driver = properties.getProperty("driverClassName",null);
            url = properties.getProperty("url",null);
            username = properties.getProperty("username" , null);
            password = properties.getProperty("password",null);
            if (driver != null && url != null && username != null && password != null) {
                Class.forName(driver);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn, Statement st , ResultSet rs){
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
