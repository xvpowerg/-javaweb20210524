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
		//HttpServletRequest �� ViewServlet��HttpServletRequest�O�@�˪�
		//�]���Oforward �Ө�FoodServlet
		PrintWriter out = resp.getWriter();
				
		//getAttribute ���o���O����
		ViewObject viewObj = 
				(ViewObject)req.getAttribute("viewobj");
		out.println("Food!!"+viewObj.getSexStrintg());
	}
}
