package devops.Capstone.controllerWithoutDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import devops.Capstone.service.UserService;

public class AmericaController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		ArrayList<String> vacc = new ArrayList<String>();
                    vacc = new UserService().getAmericanVaccines();
	           request.setAttribute("AmericanVaccines", vacc);
		   //request.setAttribute("IndiaOrAmerica", "America");
		   out.println("America");
	        RequestDispatcher rd = request.getRequestDispatcher("/america.jsp");
				    rd.forward(request, response);
	}	  
}
