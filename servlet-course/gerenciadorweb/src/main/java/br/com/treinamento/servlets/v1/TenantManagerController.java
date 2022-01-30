package br.com.treinamento.servlets.v1;

import br.com.treinamento.actions.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/application")
public class TenantManagerController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String actionParam = req.getParameter("action");

        switch (actionParam) {
            case "listTenants":
                ListTenants listTenants = new ListTenants();
                listTenants.execute(req, resp);
                break;
            case "registerTenant":
                RegisterTenant registerTenant = new RegisterTenant();
                registerTenant.execute(req, resp);
                break;
            case "getTenantInfo":
                TenantInfo tenantInfo = new TenantInfo();;
                tenantInfo.execute(req, resp);
                break;
            case "editTenant":
                EditTenant editTenant = new EditTenant();
                editTenant.execute(req, resp);
                break;
            case "deleteTenant":
                DeleteTenant deleteTenant = new DeleteTenant();
                deleteTenant.execute(req, resp);
        }
    }

}
