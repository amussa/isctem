package mz.co.empresa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String utilizador = req.getParameter("utilizador");
		String senha = req.getParameter("senha");
		System.out.println(String.format("Login: %s, Senha: %s", utilizador, senha));
		if (utilizador.equals("admin") && senha.equals("isctem")) {
			resp.sendRedirect("welcome.html");
		} else {
			req.getRequestDispatcher("erro.html").forward(req, resp);
		}
	}
	
}
