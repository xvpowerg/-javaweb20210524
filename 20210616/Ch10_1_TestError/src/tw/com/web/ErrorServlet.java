package tw.com.web;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ErrorServlet")
public class ErrorServlet extends HttpServlet{
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
//		resp.getWriter().println("Error!!!");
		Integer statusCode = (Integer)req.getAttribute("javax.servlet.error.status_code");
		if (statusCode != null) {
			String errorMsg = "";
			String errorImage = "";
			switch(statusCode) {
			case 404:
				errorMsg="你迷路了嗎?";
				errorImage = "error404.png";
				break;
			default:
				errorMsg="發生錯誤優!!";
				errorImage = "maxresdefault.jpg";
				break;	
			}
			
			req.setAttribute("error_msg", errorMsg);
			req.setAttribute("error_image", errorImage);
			req.getRequestDispatcher("/error_page.jsp").
			forward(req, resp);
			
			
		}
		
		
//		for (Enumeration  e =  
//				req.getAttributeNames();e.hasMoreElements();) {
//			//System.out.println(e .nextElement());
//			String key = e .nextElement().toString();
//			System.out.println(key+":"+req.getAttribute(key));
//		}
	
		
	}
}
