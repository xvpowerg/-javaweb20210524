package tw.com.web;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.tools.HttpRequestTools;
import static tw.com.web.tools.HttpRequestTools.getParameter;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet{
//input HttpServletRequest
//output	HttpServletResponse
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String lan = HttpRequestTools.
				getParameter(req,"lan","en");
		int count = HttpRequestTools.
				getParameter(req, "number", 0);
		
		//字串轉成整數
		//HTML 的空白 &nbsp;
		for (int i =1;i<=count ;i++) {
			out.print("<a href='#'>"+i+"</a>&nbsp;");	
		}
		
	}
	
}
