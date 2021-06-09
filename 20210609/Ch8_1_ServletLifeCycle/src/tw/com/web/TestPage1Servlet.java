package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class TestPage1Servlet extends HttpServlet {
	
	//預設情況下 第一位呼叫當前Servlet時候 會開始建立Servlet物件
	//呼叫順序	
	//只有建立Servlet物件時才會呼叫init
	//init(ServletConfig config)
	//init(ServletConfig config) 內會呼叫 init()
	
	//會產生一組執行序(Thread) 呼叫當前Servlet物件的service(ServletRequest req, ServletResponse res)
	//service(ServletRequest req, ServletResponse res) 內呼叫 service(HttpServletRequest req, HttpServletResponse resp)
	//service(HttpServletRequest req, HttpServletResponse resp) 判定呼叫doPost還doGet...
	//容器關閉 會呼叫destroy()

	
	
	//不建議複寫 因為ServletConfig 可能因為錯誤的複寫導致 失效系統容易產生錯誤
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//	// TODO Auto-generated method stub
//		System.out.println("init(ServletConfig)");		
//	}
	//建議複寫 init()
		@Override
		public void init() throws ServletException {
				System.out.println("init()");
		}
	
		
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName());
			//System.out.println("getServletConfig:"+this.getServletConfig());
			//System.out.println("getServletContext:"+this.getServletContext());						
		}
	@Override
	public void destroy() {
		//釋放資源
		System.out.println("destroy!!");	
		
	}
	
	
}
