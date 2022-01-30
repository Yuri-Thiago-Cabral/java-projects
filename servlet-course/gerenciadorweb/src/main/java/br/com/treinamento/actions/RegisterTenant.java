package br.com.treinamento.actions;

import br.com.treinamento.domain.Database;
import br.com.treinamento.domain.Tenant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterTenant {

    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
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

        req.setAttribute("name", tenant.getName());
        req.setAttribute("cnpj", tenant.getCnpj());

        return "redirect:application?action=listTenants";
    }

}
