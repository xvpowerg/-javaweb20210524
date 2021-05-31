package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out =   resp.getWriter();
	String countStr = req.getParameter("count");
	String lineStr = req.getParameter("line");
	int count = countStr==null?0:Integer.parseInt(countStr);
	int line = lineStr == null?0: Integer.parseInt(lineStr);	
	out.println("Hello!");
	out.println("<p>");
	for (int i = 1,br=1;i<=count;i++,br++) {
		out.println(i+" ");
		//Â_¦æ
		if (br==line) {
			out.println("<br>");
			br = 0;
		}
				
	}
	out.println("</p>");
	
	}
}
