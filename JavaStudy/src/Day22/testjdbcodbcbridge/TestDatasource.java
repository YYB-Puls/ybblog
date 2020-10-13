package Day22.testjdbcodbcbridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatasource {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch (ClassNotFoundException e){
            System.out.println("无法加载数据库驱动");
            e.printStackTrace();
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:odbc:javadatasource");
        } catch (SQLException e) {
            System.out.println("创建数据库连接出错");
            e.printStackTrace();
        }
        if (conn == null){
            System.out.println("无法创建连接数据库");
        }else{
            System.out.println("数据源测试成功");
            conn.close();
        }

    }
}
