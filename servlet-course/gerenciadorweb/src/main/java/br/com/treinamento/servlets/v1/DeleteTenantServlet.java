package br.com.treinamento.servlets.v1;

import br.com.treinamento.domain.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/api/v1/servlet/delete/tenant")
public class DeleteTenantServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
        Database database = new Database();
        database.delete(Integer.valueOf(id));
        resp.sendRedirect("/api/v1/servlet/list/tenants");
    }
}
