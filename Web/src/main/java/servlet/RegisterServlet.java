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
    }

    protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws  IOException{
        doPost(request, response);
    }




}
