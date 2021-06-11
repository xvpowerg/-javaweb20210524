package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sendMsg")
public class SendMsgServlet extends HttpServlet {
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html; charset=utf-8");
	//�w�]�Oiso8859-1 ���������@�אּutf-8
	req.setCharacterEncoding("utf-8");
//		PrintWriter out = resp.getWriter();	
		String msg = req.getParameter("msg");
		
		getServletContext().setAttribute("msg", msg);
		req.setAttribute("info", "Complete!");
		req.setAttribute("url", "index.html");
		req.getRequestDispatcher("show_info.jsp").forward(req, resp);
		//Servlet ����C
		//JSP HTML �s��V			
	  
	}
	
}
