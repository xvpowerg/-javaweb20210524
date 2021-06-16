package tw.com.web;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExceptionServlet")
public class ExceptionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		runRequest(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		runRequest(req,resp);
	}
	
	void runRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("Exception!!!");
//	 在處裡Eexception的Servlet 的 request會多 javax.servlet.error.exception_type 與 javax.servlet.error.exception 的屬性

			for (Enumeration  e =  
					req.getAttributeNames();e.hasMoreElements();) {
				//System.out.println(e .nextElement());
				String key = e .nextElement().toString();
				System.out.println(key+":"+req.getAttribute(key));
			}
			
		}
		
}
