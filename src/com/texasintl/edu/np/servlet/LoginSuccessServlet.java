package com.texasintl.edu.np.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * Servlet implementation class LoginSuccessServlet
 */
public class LoginSuccessServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String loginUser = request.getParameter("un");
			out.println("<h1>Welcome:</h1>"+loginUser);
	}
}
