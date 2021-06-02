package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out = resp.getWriter();
			String  toPage2 = req.getParameter("toPage2");
			if (Boolean.parseBoolean(toPage2)) {
				//會轉換網址列
				//類似手動輸入網址後按下Enter
				resp.sendRedirect("page2");	
			}
			out.println("Page1!!");
			
			
		}
}
