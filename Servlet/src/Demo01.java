import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Demo01")
public class Demo01 extends HttpServlet {
    private String message;

    public void init() throws ServletException{
        //执行必需的初始化
        message = "Hello World";
    }

    public void doGet (HttpServletRequest request , HttpServletResponse response) throws  ServletException , IOException {
        //设置响应内容类型
        response.setContentType("text/html");
        //实际的逻辑
        PrintWriter out = response.getWriter();
        out.print("<h1>"+message+"</h1>");

    }

    public void destroy(){

    }
}
