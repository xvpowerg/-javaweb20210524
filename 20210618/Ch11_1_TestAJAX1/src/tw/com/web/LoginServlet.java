package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	//���]�b���O qwer �K�X:12345
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String defAccount = "qwer";
		String defPassword = "12345";		
		String account = req.getParameter("account");
		String password =req.getParameter("password");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		if (defAccount.equals(account) && 
				defPassword.equals(password)) {
			out.print("�n�J���\");
			//req.setAttribute("msg", "�n�J���\");
		}else {
			out.print("�n�J����");
			//req.setAttribute("msg", "�n�J����");
		}
		//req.getRequestDispatcher("/user.jsp").forward(req, resp);
		
	
	
	}
}
