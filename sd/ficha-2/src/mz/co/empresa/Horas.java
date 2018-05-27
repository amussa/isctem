package mz.co.empresa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Horas extends HttpServlet {

   private String message;
   private int hitCount;

   public void init() throws ServletException {
      hitCount = 0;
   }

   public void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      response.setIntHeader("Refresh", 1);
      message = new Date().toString();;
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
   }

   public void destroy() {
   }
}
