package tw.com.web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/page2"},loadOnStartup = 3)
public class TestPage2Servlet extends HttpServlet{
	
		@Override
		public void init() throws ServletException {
		// TODO Auto-generated method stub
			System.out.println("page2 Start....init");
			try {
				TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException ex) {
				
			}
			
			System.out.println("page2 End....init");
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
			resp.getWriter().println("Hello!");
			
		}
}
