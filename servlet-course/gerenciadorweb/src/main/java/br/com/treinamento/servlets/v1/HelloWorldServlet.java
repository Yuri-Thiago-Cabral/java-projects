package br.com.treinamento.servlets.v1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/api/v1/servlet/welcome")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<span>Welcome to first servlet java</span>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        System.out.println("[INFO]: O servlet foi chamado com sucesso");
    }

}
