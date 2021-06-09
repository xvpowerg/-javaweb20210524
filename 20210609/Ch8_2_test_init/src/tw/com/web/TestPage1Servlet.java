package tw.com.web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//�e���Ұʮ� �إ�TestPage1Servlet����
//loadOnStartup = -1 �w�]���p �Ĥ@�������eServlet�ɫإߪ���

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
