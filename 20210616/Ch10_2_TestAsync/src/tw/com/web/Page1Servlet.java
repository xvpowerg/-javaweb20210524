package tw.com.web;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	private final static ExecutorService service = Executors.newCachedThreadPool();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		System.out.println("Start !!!"+Thread.currentThread().getName());

		
		service.execute(()->{
			try {
				System.out.println("Start Work!!");
				TimeUnit.SECONDS.sleep(10);		
				System.out.println("Finish Work!!");						
			}catch(Exception ex) {
				System.out.println(ex);
			}			
		});
		
		
		System.out.println("End !!!"+Thread.currentThread().getName());				
	}
	
	@Override
	public void destroy() {
		service.shutdownNow();		
	}
}
