package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//如果有@WebServlet 也 web.xml 如果url-pattern 是不同的 那麼會融合
//如果有@WebServlet 也 web.xml 如果url-pattern 相同 在運行容器時會錯誤
//@WebServlet(name="mypage2Servlet" ,
//		urlPatterns = {"/myPage2_2","/myPageServlet"})
@WebServlet("/myPage2Servlet")
public class Page2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {		
//		super.doGet(req, resp);
		PrintWriter out = resp.getWriter();
		out.println("Page2");
		
	}

	
	
}
