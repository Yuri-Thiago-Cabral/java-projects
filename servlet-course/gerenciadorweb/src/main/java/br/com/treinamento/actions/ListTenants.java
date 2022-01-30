package br.com.treinamento.actions;

import br.com.treinamento.domain.Database;
import br.com.treinamento.domain.Tenant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListTenants {

    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Database database = new Database();
        List<Tenant> tenantList = database.findAllTenants();
        req.setAttribute("tenants", tenantList);


        return "forward:/list-tenants-refactored.jsp";
    }
}
