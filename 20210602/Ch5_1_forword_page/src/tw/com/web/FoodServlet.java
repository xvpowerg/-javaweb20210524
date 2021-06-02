package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.ViewObject;
@WebServlet("/food")
public class FoodServlet extends HttpServlet {	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpServletRequest 跟 ViewServlet的HttpServletRequest是一樣的
		//因為是forward 來到FoodServlet
		PrintWriter out = resp.getWriter();
				
		//getAttribute 取得的是物件
		ViewObject viewObj = 
				(ViewObject)req.getAttribute("viewobj");
		out.println("Food!!"+viewObj.getSexStrintg());
	}
}
