package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginJson")
public class LoginJsonServlet extends HttpServlet {
	
	//���]�b���O qwer �K�X:12345
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String defAccount = "qwer";
		String defPassword = "12345";		
		String account = req.getParameter("account");
		String password =req.getParameter("password");
		String json = "{\"msg\":\"%s\",\"isLogin\":%b,\"location\":\"%s\"}";		
		String msg  = "";
		boolean isLogin = false;
		String location = "";
		//�]�w�榡��JSON
		resp.setContentType("application/json");
		//�y�t�OUTF-8
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		if (defAccount.equals(account) && 
				defPassword.equals(password)) {
			//msg 
			//isLogin
			//location
			msg = "�n�J���\";	
			isLogin = true;
			location = "user.html";
		}else {
			msg ="�n�J����";
		
		}
		json = String.format(json, msg,isLogin,location);
		
		out.println(json);

	}
}
