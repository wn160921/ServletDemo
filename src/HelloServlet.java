import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    public long getLastModified(HttpServletRequest request){
        return -1;
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.execute(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.execute(request, response);
    }

    //执行方法
    private void execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");//设置编码方式
        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        String param = request.getParameter("param");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01" +
                "Transitional//EN\">");
        out.println("<html><head><title>A Servlet</title></head>");
        out.println("<body>");
        out.println("以" + method + "方式访问该页面。取到的param参数为："
                + param + "<br/>");
        out.println("<form action='" + requestURI + "' method='get'>"
                + "<input type='text' name='param' value='param sting'><input type='submit'" +
                "value='以get方式查询页面" + requestURI + "'></form>");
        out.println("<form action='" + requestURI + "' method='post'>"
                + "<input type='text' name='param' value='param sting'><input type='submit'" +
                "value='以post方式查询页面" + requestURI + "'></form>");

        //由客户端浏览器读取该文档的更新时间
        out.println("<script>document.write('本页面最后更新时间：'" +
                "+document.lastModified);</script>");
        out.println("</body></html>");
        out.flush();
        out.close();
    }
}
