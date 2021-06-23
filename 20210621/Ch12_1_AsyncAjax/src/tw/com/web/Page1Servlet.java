package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;
//asyncSupported = true �~�i�I�s startAsync();
@WebServlet(urlPatterns = {"/page1"},asyncSupported = true)
public class Page1Servlet extends HttpServlet {
	private  ExecutorService es = Executors.newCachedThreadPool();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		AsyncContext ctx = req.startAsync();	 
			 
		Random ran = new Random();
			es.execute(()->{				
				try{
				PrintWriter out =ctx.getResponse().getWriter();
					System.out.println("�}�l�u�@!!");
					//���ɶ����u�@!!
					TimeUnit.SECONDS.sleep(5);
					int max = ran.nextInt(Integer.MAX_VALUE);
					out.println("�����u�@!!:"+max);
					//System.out.println("�����u�@!!:"+max);
					//�i���D�P�B�����F
					ctx.complete();	
				}catch(Exception ex) {
					System.out.println(ex);
				}				
			});
		
//			AsyncContext ctx = req.startAsync();	 
//			 
//			AsyncObject asyncObj = new AsyncObject(ctx);
//				es.execute(()->{				
//					asyncObj.run();
//				});
		
	}
}
