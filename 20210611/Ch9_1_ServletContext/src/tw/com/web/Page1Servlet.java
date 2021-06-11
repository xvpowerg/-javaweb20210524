package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			 PrintWriter out =   resp.getWriter();
			 
			 //HttpSession 個人
			 HttpSession session =    req.getSession();			 
			 int ssCount = 0;
			 Integer tmpSSCoun =  (Integer)session.getAttribute("sessCount");
			 if(tmpSSCoun != null) ssCount = tmpSSCoun;
			 ssCount++;
			 session.setAttribute("sessCount", ssCount);
			 
			//ServletContext 公共
		     ServletContext app =   getServletContext();
		     int count = 0;
		     Integer tmpCount = (Integer)app.getAttribute("count");
		     if (tmpCount != null)  count = tmpCount;		     
		     ++count;
		     app.setAttribute("count", count);		  
		     
		     out.println("ServletContext:"+count);
		     out.println("HttpSession:"+ssCount);
		}
}
