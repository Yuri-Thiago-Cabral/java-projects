package br.com.treinamento.actions;

import br.com.treinamento.domain.Database;
import br.com.treinamento.domain.Tenant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TenantInfo {

    public void execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
        Database database = new Database();
        Tenant tenant = database.findById(Integer.valueOf(id));

        req.setAttribute("currentTenant", tenant);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit-tenant-form.jsp");
        dispatcher.forward(req, resp);
    }

}
