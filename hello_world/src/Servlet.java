import sun.font.Script;

import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    private String name = "yuan";
    private String password = "123456";

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
            String loginName = request .getParameter("userName");
            String  loginPassword = request.getParameter("userPassword");
            response.setContentType("text/html; charset= UTF-8");


           if (loginName.equals(name) && loginPassword.equals(password)){
               response.sendRedirect("/homepage.jsp");
           }else {
               /*request.getRequestDispatcher("/login.jsp").forward(request ,response);*/
               response.sendRedirect("/login.jsp");


           }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
             super.doGet(request ,response);
    }
}
