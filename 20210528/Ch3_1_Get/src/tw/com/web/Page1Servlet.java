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

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
//input HttpServletRequest
//output	HttpServletResponse
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		//out.println("Page1");
		String lan = HttpRequestTools.getParameter(req,"lan","en");
		String number = HttpRequestTools.getParameter(req, "number", "0");
		//給預設值 因為改為getParameter 所以不需要
//		if (number == null) {
//			number = "0";
//		}
		
		
		//out.println("lan:"+lan);
		//out.println("number:"+number);
		System.out.println("Test!!!");		
		//字串轉成整數
		//HTML 的空白 &nbsp;
		int count = 0;
		try{
			count = Integer.parseInt(number);	
		}catch(NumberFormatException ex) {
			System.err.println(ex);
		}
		
		for (int i =1;i<=count ;i++) {
			out.print("<a href='#'>"+i+"</a>&nbsp;");	
		}
		
	}
	
}
