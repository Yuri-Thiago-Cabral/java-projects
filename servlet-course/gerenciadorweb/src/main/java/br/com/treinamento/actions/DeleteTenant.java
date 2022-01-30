package br.com.treinamento.actions;

import br.com.treinamento.domain.Database;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteTenant {
    public void execute(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String id = req.getParameter("id");
        Database database = new Database();
        database.delete(Integer.valueOf(id));
        resp.sendRedirect("application?action=listTenants");
    }
}
