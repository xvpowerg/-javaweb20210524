package tw.com.web;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.ViewObject;
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
		
	
		@Override
		public void init() throws ServletException {
			ViewObject.addDispatcherMapping("1", "/food");
			ViewObject.addDispatcherMapping("2", "/movie");
			ViewObject.addDispatcherMapping("3", "/sport");		
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// HttpServletRequest Attribute �Opage to page
			resp.setContentType("text/html;charset=UTF-8");
			//getParameter �@�w�O�r��
			String sex = req.getParameter("sex");
			String age = req.getParameter("age");
			String type = req.getParameter("type");
			ViewObject viewObj = new ViewObject(sex,age,type);
			//setAttribute �]�w���� 
			//getAttribute ���o���� 
			req.setAttribute("viewobj", viewObj);
			req.getRequestDispatcher(viewObj.getDispatcherMapping()).forward(req, resp);
//			switch(type) {
//			case "1":
//				//�ѼƬOServlet��url
//				//getRequestDispatcher �ഫ��t�@��Servlet
//				//�`�N���}���|��
//				req.getRequestDispatcher("/food").forward(req, resp);
//				break;	
//			}
			
		}
}

