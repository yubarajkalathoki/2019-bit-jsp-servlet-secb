import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("This is login servlet");
			String username = request.getParameter("un");
			String password = request.getParameter("pw");
//			out.println("Username is: "+username);
//			out.println("</br>Password is: "+password);
//			System.out.println("Namaskar!");
			
			//logic for database insert/get and so on
			
			if(username.equals("admin") && password.equals("admin")) {
//				send to loginSuccess.html
//				response.sendRedirect("./gaurav");
				RequestDispatcher rd = request.getRequestDispatcher("./gaurav");
				rd.forward(request, response);
//				rd.include(request, response);
			}else {
//				send to loginFailed.html
				response.sendRedirect("./loginFailed.html");
			}
			
		}
}