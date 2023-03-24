

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminServ extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		
		
		String name = request.getParameter("fname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String enrol = request.getParameter("enrol");
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("  <link rel='stylesheet' href='css/style1.css'>");
		out.print("</head>");
		out.print("<body>");
		out.print("<table border = '1'>");
		out.print("<tr>");
		out.print("<th>Name</th>");
		out.print("<th>Email</th>");
		out.print("<th>Password</th>");
		out.print("<th>Enrollment No.</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>"+name+"</td>");
		out.print("<td>"+email+"</td>");
		out.print("<td>"+pass+"</td>");
		out.print("<td>"+enrol+"</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</html>");
		out.print("</head>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
