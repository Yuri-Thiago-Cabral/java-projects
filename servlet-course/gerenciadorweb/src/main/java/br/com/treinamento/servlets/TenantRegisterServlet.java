package br.com.treinamento.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TenantRegisterServlet
 */
@WebServlet("/newTenant")
public class TenantRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name = req.getParameter("name");
			Tenant tenant = new Tenant();
			tenant.setName(name);

			Banco banco = new Banco();
			banco.save(tenant);

			//Redireciona para o jps de sucesso no cadastro
			RequestDispatcher rd = req.getRequestDispatcher("successregister.jsp");
			req.setAttribute("name", tenant.getName());
			rd.forward(req, resp);
		}
	
}
