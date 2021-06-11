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
			ServletConfig servletConfig =   getServletConfig();//�ӷ��Oinit(ServletConfig)
			//this.getInitParameter(name) �I�sServletConfig ����InitParameter()
			//�]�w���w��Servlet�i�֦���l�ưѼ�		
			String count1 = servletConfig.getInitParameter("count");
			String count2 = getInitParameter("count");//�q�`�ϥγo��
			
			resp.getWriter().println(count1+":"+count2);
			//servletConfig.getInitParameter(name) //�M�ݩ��eServlet
			//servletConfig.getServletContext(); setAttribute ��e��WebApp���iŪ����	
		}
}
