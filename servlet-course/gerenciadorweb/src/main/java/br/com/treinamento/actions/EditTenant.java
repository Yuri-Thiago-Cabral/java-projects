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

public class EditTenant {

    public void execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String cnpj = req.getParameter("cnpj");
        String date = req.getParameter("date");
        String id = req.getParameter("id");

        Date convertDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            convertDate = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new ServletException("Não foi possível editar a empresa");
        }

        Database database = new Database();
        Tenant tenant = database.findById(Integer.valueOf(id));
        tenant.setName(name);
        tenant.setCnpj(cnpj);
        tenant.setDate(convertDate);

        resp.sendRedirect("application?action=listTenants");
    }
}
