package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out = resp.getWriter();
			String account = req.getParameter("account");
			String pass = req.getParameter("pass");
			out.println(account+":"+pass);
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out = resp.getWriter();
			String account = req.getParameter("account");
			String pass = req.getParameter("pass");
			out.println("Post:"+account+":"+pass);
		
		}
}
