package br.com.treinamento.servlets.v1;

import br.com.treinamento.domain.Database;
import br.com.treinamento.domain.Tenant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/api/v1/register/tenant")
public class RegisterTenantServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String cnpj = req.getParameter("cnpj");
        String date = req.getParameter("date");

        Tenant tenant = new Tenant();
        tenant.setName(name);
        tenant.setCnpj(cnpj);

        Date convertDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            convertDate = dateFormat.parse(date);
        } catch (ParseException e) {
           throw new ServletException("Não foi possível cadastrar a empresa");
        }

        tenant.setDate(convertDate);

        Database database = new Database();
        database.save(tenant);

        /*PrintWriter printWriter = resp.getWriter();
        printWriter.println(String.format("Empresa %s com cnpj %S cadastrada com sucesso",
                tenant.getName(), tenant.getCnpj()));*/

        req.setAttribute("name", tenant.getName());
        req.setAttribute("cnpj", tenant.getCnpj());

        resp.sendRedirect("/api/v1/servlet/list/tenants");

        /*RequestDispatcher dispatcher = req.getRequestDispatcher("/api/v1/servlet/list/tenants");
        dispatcher.forward(req, resp);*/
    }
}
