package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="page1",urlPatterns = "/page1")
public class Page1Servlet extends HttpServlet{
		@Override
		public void init() throws ServletException {
				String count = getInitParameter("count");
				System.out.println("init count:"+count);
		}
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			ServletConfig servletConfig =   getServletConfig();//ㄓ方琌init(ServletConfig)
			//this.getInitParameter(name) ㊣ServletConfig ずInitParameter()
			//砞﹚﹚Servlet局Τ﹍て把计		
			String count1 = servletConfig.getInitParameter("count");
			String count2 = getInitParameter("count");//硄盽ㄏノ硂舱
			
			resp.getWriter().println(count1+":"+count2);
			//servletConfig.getInitParameter(name) //盡妮讽玡Servlet
			//servletConfig.getServletContext(); setAttribute 讽玡WebApp常弄	
		}
}
