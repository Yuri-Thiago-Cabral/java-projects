package br.com.treinamento.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListTenantsServlet
 */
@WebServlet("/listAllTenants")
public class ListTenantsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Tenant> list = banco.getTenants();
		
		PrintWriter out = response.getWriter();
		
		for (Tenant t : list) {
			out.println(String.format("<h1>%s</h1>", t.getName()));
		}
	}

}
