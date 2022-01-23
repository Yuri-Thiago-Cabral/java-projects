package br.com.treinamento.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listAllTenants")
public class ListTenantsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Tenant> list = banco.getTenants();
				
		request.setAttribute("tenants", list);
		RequestDispatcher rd = request.getRequestDispatcher("list-tenants.jsp");
		rd.forward(request, response);
	}

}
