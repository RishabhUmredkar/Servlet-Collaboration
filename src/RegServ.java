	

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServ extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String enrol = request.getParameter("enrol");
		
		
		
		
		if(enrol.equals("abc123")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("admin");
			dispatcher.forward(request, response);

		}
		else if(enrol.equals("abc122")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("user");
			dispatcher.forward(request, response);
		}
		else if(enrol.equals("")){
			out.print("<center>");
			out.print("Enter correct Enrollment No.<br>");
			out.print("You are neither Admin nor User");
			out.print("</center>");

			out.print("<br>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
			dispatcher.include(request, response);
		}

		else {
			response.sendRedirect("nuser");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}



