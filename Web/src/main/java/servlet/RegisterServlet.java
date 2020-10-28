package servlet;

import util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        if (insert(name, password) > 0) {
            request.getRequestDispatcher("/register2.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException, ServletException {
        doPost(request, response);
    }

    public int insert(String name , String password){
        int savResult = 0;
        try {
            Connection connection = JdbcUtil.jdbc();
            String sql = "insert into user(id,username ,password) values(?,?,?)";
            PreparedStatement psmt = connection.prepareStatement(sql);
            psmt.setString(1, null);
            psmt.setString(2, name);
            psmt.setString(3, password);
            savResult = psmt.executeUpdate();
            JdbcUtil.close(connection, psmt, null);
        }catch (SQLException e ){
            e.printStackTrace();
        }
        return savResult;
    }


}
