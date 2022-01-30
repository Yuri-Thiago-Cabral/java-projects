package br.com.treinamento.servlets.v1;

import br.com.treinamento.actions.*;

import javax.servlet.RequestDispatcher;
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

        String redirectPath = null;
        switch (actionParam) {
            case "listTenants":
                ListTenants listTenants = new ListTenants();
                redirectPath = listTenants.execute(req, resp);
                break;
            case "registerTenant":
                RegisterTenant registerTenant = new RegisterTenant();
                redirectPath = registerTenant.execute(req, resp);
                break;
            case "getTenantInfo":
                TenantInfo tenantInfo = new TenantInfo();;
                redirectPath = tenantInfo.execute(req, resp);
                break;
            case "editTenant":
                EditTenant editTenant = new EditTenant();
                redirectPath = editTenant.execute(req, resp);
                break;
            case "deleteTenant":
                DeleteTenant deleteTenant = new DeleteTenant();
                redirectPath = deleteTenant.execute(req, resp);
        }

        String[] typeAndAddress = redirectPath.split(":");
        if (typeAndAddress[0].equals("redirect")) {
            resp.sendRedirect(typeAndAddress[1]);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher(typeAndAddress[1]);
            dispatcher.forward(req, resp);
        }
    }

}
