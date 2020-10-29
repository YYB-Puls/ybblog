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
import java.sql.ResultSet;

@WebServlet(name = "/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        if (selectUser(name, password) == true) {
            System.out.println("登录成功");
            request.getRequestDispatcher("/show.jsp").forward(request, response);
        }else {
            System.out.println("登录失败");
        }
    }


    public static boolean selectUser(String name , String password){
        ResultSet rs;
        boolean checkResult = false;
        try {
            Connection connection = JdbcUtil.jdbc();
            String sql = "select * from user where username = ? and password = ?";
            PreparedStatement psmt = connection.prepareStatement(sql);
            psmt.setString(1, name);
            psmt.setString(2, password);
            rs = psmt.executeQuery();
            checkResult = rs.next();
            JdbcUtil.close(connection, psmt, rs);
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkResult;
    }
}
