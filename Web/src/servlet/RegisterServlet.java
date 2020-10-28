package servlet;

import util.JdbcUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet(name = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        /*int insert = insert(name, password);
        if (insert != 0) {
            response.sendRedirect("/register2.jsp");
        }else {
            response.sendRedirect("/register.jsp");
        }*/
    }

    protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws  IOException{
        doPost(request, response);
    }


    public static int insert(String name ,String password){
        int saveResult = 0;
        try {
            Connection connection = JdbcUtil.getConn();
            String sql = "insert into user(name , password) values(? , ?)";
            PreparedStatement psmt = connection.prepareStatement(sql);
            psmt.setString(1, name);
            psmt.setString(2, password);
            saveResult = psmt.executeUpdate();
            JdbcUtil.close(connection, psmt, null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return saveResult;
    }

}
