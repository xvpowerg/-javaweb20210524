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
	
	//�w�]���p�U �Ĥ@��I�s��eServlet�ɭ� �|�}�l�إ�Servlet����
	//�I�s����	
	//�u���إ�Servlet����ɤ~�|�I�sinit
	//init(ServletConfig config)
	//init(ServletConfig config) ���|�I�s init()
	
	//�|���ͤ@�հ����(Thread) �I�s��eServlet����service(ServletRequest req, ServletResponse res)
	//service(ServletRequest req, ServletResponse res) ���I�s service(HttpServletRequest req, HttpServletResponse resp)
	//service(HttpServletRequest req, HttpServletResponse resp) �P�w�I�sdoPost��doGet...
	//�e������ �|�I�sdestroy()

	
	
	//����ĳ�Ƽg �]��ServletConfig �i��]�����~���Ƽg�ɭP ���Ĩt�ήe�����Ϳ��~
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//	// TODO Auto-generated method stub
//		System.out.println("init(ServletConfig)");		
//	}
	//��ĳ�Ƽg init()
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
		//����귽
		System.out.println("destroy!!");	
		
	}
	
	
}
