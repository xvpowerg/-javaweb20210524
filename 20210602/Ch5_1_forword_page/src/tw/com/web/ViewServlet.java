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
			// HttpServletRequest Attribute 是page to page
			resp.setContentType("text/html;charset=UTF-8");
			//getParameter 一定是字串
			String sex = req.getParameter("sex");
			String age = req.getParameter("age");
			String type = req.getParameter("type");
			ViewObject viewObj = new ViewObject(sex,age,type);
			//setAttribute 設定物件 
			//getAttribute 取得物件 
			req.setAttribute("viewobj", viewObj);
			req.getRequestDispatcher(viewObj.getDispatcherMapping()).forward(req, resp);
//			switch(type) {
//			case "1":
//				//參數是Servlet的url
//				//getRequestDispatcher 轉換到另一個Servlet
//				//注意網址不會改
//				req.getRequestDispatcher("/food").forward(req, resp);
//				break;	
//			}
			
		}
}

