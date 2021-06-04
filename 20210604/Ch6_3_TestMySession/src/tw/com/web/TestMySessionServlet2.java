package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.tools.MySession;
import tw.com.web.tools.WebApplication;

@WebServlet("/testMySession2")
public class TestMySessionServlet2  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out = resp.getWriter();
			MySession session = WebApplication.getSession(req, resp);
			out.println(session.getAttribute("msg"));	
		}
}
