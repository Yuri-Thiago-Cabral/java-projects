package br.com.treinamento.servlets.v1;

import br.com.treinamento.domain.Database;
import br.com.treinamento.domain.Tenant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/api/v1/servlet/list/tenants")
public class ListTenantsServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Database database = new Database();
        List<Tenant> tenantList = database.findAllTenants();

        /*PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<ul>");
        for (Tenant tenant : tenantList) {
            printWriter.println(String.format("<li>%s</li>", tenant));
        }
        printWriter.println("</ul>");
        printWriter.println("</body>");
        printWriter.println("</html>");*/

        req.setAttribute("tenants", tenantList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/list-tenants.jsp");
        dispatcher.forward(req, resp);
    }

}
