

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserServ extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String enrol = request.getParameter("enrol");
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("  <link rel='stylesheet' href='css/style1.css'>");
		
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1'>");
	    out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
	    out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
	    out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
		
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
		out.print(" <a href='index.html' class='btn btn-info btn-lg'>");
		out.print("<span class='glyphicon glyphicon-log-out'></span> Log out");
		out.print("</a>");
		
		out.print("</html>");
		out.print("</head>");
}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
