package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter("/user/*")
public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest  req = (HttpServletRequest)request;
		HttpServletResponse  resp =  (HttpServletResponse)response;
		HttpSession session = req.getSession();

		if (session.getAttribute("login") != null) {
			chain.doFilter(request, response);
		}else {
			
			resp.sendRedirect("../index.jsp");
		}
		
	}
	
}
