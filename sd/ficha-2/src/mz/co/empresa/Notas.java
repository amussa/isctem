package mz.co.empresa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Notas extends HttpServlet {

	private static List<Nota> notas = new ArrayList<Nota>();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = getServletConfig().getInitParameter("action");
		if (action != null) {
			switch (action) {
			case "salvar":
				salvar(req, resp);
				break;
			default:
				break;
			}
		}
		setNotas(req, resp);
	}

	private void setNotas(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("notas", notas);
		req.getRequestDispatcher("notas.jsp").forward(req, resp);
	}

	private void salvar(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		notas.add(new Nota(req.getParameter("texto")));
	}

}
