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

@WebServlet(urlPatterns = "/api/v1/servlet/find/tenant")
public class TenantInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Database database = new Database();
        Tenant tenant = database.findById(Integer.valueOf(id));

        req.setAttribute("currentTenant", tenant);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit-tenant-form.jsp");
        dispatcher.forward(req, resp);
    }
}
