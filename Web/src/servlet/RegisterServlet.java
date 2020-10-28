package servlet;

import com.sun.deploy.net.HttpRequest;
import util.JDBC;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet(name = "register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        int insert = insert(name, password);
        if (insert != 0) {

        }


    }

    protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws  IOException{
        doPost(request, response);
    }


    public static int insert(String name ,String password){
        int saveResult = 0;
        try {
            Connection connection = JDBC.getConn();
            String sql = "insert into user(name , password) values(? , ?)";
            PreparedStatement psmt = connection.prepareStatement(sql);
            psmt.setString(1, name);
            psmt.setString(2, password);
            saveResult = psmt.executeUpdate();
            JDBC.close(connection, psmt, null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return saveResult;
    }

}
