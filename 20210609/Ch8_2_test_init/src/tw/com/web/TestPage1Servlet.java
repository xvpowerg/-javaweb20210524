package tw.com.web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//容器啟動時 建立TestPage1Servlet物件
//loadOnStartup = -1 預設情況 第一次執行當前Servlet時建立物件

@WebServlet(urlPatterns = {"/page1"},loadOnStartup = 1)
public class TestPage1Servlet extends HttpServlet{	
		@Override
		public void init() throws ServletException {
		// TODO Auto-generated method stub
			System.out.println("page1 Start....init");
			try {
				TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException ex) {
				
			}
			
			System.out.println("page1 End....init");
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
			resp.getWriter().println("Hello!");
			
		}
}
